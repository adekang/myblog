import { Editor } from '@bytemd/react'
import gfm from '@bytemd/plugin-gfm'
import highlight from '@bytemd/plugin-highlight'
import frontmatter from '@bytemd/plugin-frontmatter'
import React, { useEffect, useState } from 'react'
import './index.css'
import zh_Hans from 'bytemd/locales/zh_Hans.json'
import { Button, Input, Select } from 'antd'
import { findAllTagApi } from '@/service/tag.ts'
import { articleAddPostApi } from '@/service/article.ts'
import 'bytemd/dist/index.css'
import 'highlight.js/styles/github-dark.css'

interface Props {
}

const plugins = [
  gfm(),
  frontmatter(),
  highlight({
    init: () => {

      // const init = ['javascript', 'json', 'xml', 'markdown'];
      //
      // hljs.listLanguages().filter(language => !init.includes(language)).forEach((langName) => {
      //     // let langModule = require(`highlight.js/lib/languages/${langName}`);
      //     // console.log(hljs);
      //     // hljs.registerLanguage(langName, langModule);
      //     hljs.unregisterLanguage(langName)
      // });

      // hljs.highlight()
      // ['javascript', 'json', 'xml', 'markdown'].forEach((langName) => {
      //     let langModule = require(`highlight.js/lib/languages/${langName}`);
      //     console.log(hljs);
      //     hljs.registerLanguage(langName, langModule);
      // });
    },
  }),
  // Add more plugins here
]

export const MyEditor: React.FC<Props> = () => {
  const [content, setContent] = useState('')
  const [title, setTitle] = useState('')
  const [tagOptions, setTagOptions] = useState<any>([])
  const [tags, setTags] = useState<any[]>([])

  const handleChange = (_: any, option: any) => {
    let data: any = []
    option.map((item: any) => {
      data.push(item.data)
      return item
    })
    setTags(data)
    data = []
  }

  useEffect(() => {
    const getData = async () => {
      //   TODO  这里需要修改 { value label } 的格式l
      const { data } = await findAllTagApi()
      if (data) {
        // const res: any = data.map((item: TagInfo) => {
        //   return { value: item.tagId, label: item.tagName }
        // })
        // console.log(res)
        setTagOptions(data)
      }
    }
    getData().then()
  }, [])

  const handleSubmit = async () => {
    console.log(content)
    console.log(title)
    console.log(tags)

    const data = {
      title,
      content,
      tags,
    }

    try {
      const res = await articleAddPostApi(data)
      console.log(res)
    }
    catch (e) {
    }
  }

  return (
        <div className="w-full flex flex-col gap-4">

            <div className="h-50px grid grid-cols-3 bg-white ">
                <div className="title flex-center">
                    <div className='flex-center  text-base '>标题：</div>
                    <Input style={{ width: '80%', height: '100%' }} className="h-full" value={title}
                           onChange={e => setTitle(e.target.value)} placeholder="请输入标题"/>
                </div>
                <div className="tags  flex-center ">
                    <div className='flex-center  text-base'>标签选择：</div>
                    <Select
                        mode="multiple"
                        allowClear
                        style={{ width: '80%', height: '100%' }}
                        placeholder="Please select"
                        onChange={handleChange}
                        // options={tagOptions}
                    >
                        <Select.Option value={'第一'}>第一2222</Select.Option>
                        {tagOptions.map((item: any) => (
                            <Select.Option
                                key={item.tagId}
                                value={item.tagName}
                                data={item}
                            >
                                {item.tagName}
                            </Select.Option>
                        ))}
                    </Select>
                </div>
                <div className="flex-center">
                    <Button type="primary" onClick={handleSubmit}>发布</Button>
                </div>
            </div>

            <div className="editers">
                <Editor
                    locale={zh_Hans}
                    value={content}
                    plugins={plugins}
                    onChange={(v) => {
                      setContent(v)
                    }}
                />
            </div>
        </div>
  )
}
