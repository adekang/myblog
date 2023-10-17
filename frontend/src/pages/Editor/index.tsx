import { Editor } from '@bytemd/react'
import gfm from '@bytemd/plugin-gfm'
import React, { useEffect, useState } from 'react'
import './index.css'
import zh_Hans from 'bytemd/locales/zh_Hans.json'
import type { SelectProps } from 'antd'
import { Input, Select } from 'antd'
import type { TagInfo } from '@/service/tag.ts'
import { findAllTagApi } from '@/service/tag.ts'

interface Props {
}

const plugins = [
  gfm(),
  // Add more plugins here
]

export const MyEditor: React.FC<Props> = () => {
  const [value, setValue] = useState('')
  const [value2, setValue2] = useState('')
  const [tagOptions, setTagOptions] = useState<any>([])
  useEffect(() => {
    console.log(value)
  }, [value])

  const options: SelectProps['options'] = []
  for (let i = 10; i < 36; i++) {
    options.push({
      label: i.toString(36) + i,
      value: i.toString(36) + i,
    })
  }
  const handleChange = (value: string[]) => {
    console.log(`selected ${value}`)
  }
  useEffect(() => {
    const getData = async () => {
      //   TODO  这里需要修改 { value label } 的格式l
      const { data } = await findAllTagApi()
      if (data) {
        const res: any = data.map((item: TagInfo) => {
          return { value: item.tagId, label: item.tagName }
        })
        console.log(res)
        setTagOptions(res)
      }
    }
    getData().then()
  }, [])

  return (
        <div className="w-full flex flex-col gap-4">

            <div className="h-50px grid grid-cols-3 bg-white ">
                <div className="title flex-center">
                    <div className='flex-center  text-base '>标题：</div>
                    <Input style={{ width: '80%', height: '100%' }} className="h-full" value={value2}
                           onChange={e => setValue2(e.target.value)} placeholder="请输入标题"/>
                </div>
                <div className="tags  flex-center ">
                    <div className='flex-center  text-base'>标签选择：</div>
                    <Select
                        mode="multiple"
                        allowClear
                        style={{ width: '80%', height: '100%' }}
                        placeholder="Please select"
                        onChange={handleChange}
                        options={tagOptions}
                    />
                </div>
            </div>

            <div className="editers">
                <Editor
                    locale={zh_Hans}
                    value={value}
                    plugins={plugins}
                    onChange={(v) => {
                      setValue(v)
                    }}
                />
            </div>
        </div>
  )
}
