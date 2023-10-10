import React, { useEffect, useState } from 'react'
import { Card } from 'antd'
import { AEntryItem } from '@/components/AEntryItem'
import { articlePostApi } from '@/service/article.ts'
import type { ArticlePost } from '@/types/article.ts'

interface Props {
}

export const Root: React.FC<Props> = () => {
  const [post, setPost] = useState<ArticlePost[]>([])

  useEffect(() => {
    const fetchData = async () => {
      const { data } = await articlePostApi()
      if (data)
        setPost(data)
    }

    fetchData().catch()
  }, [])

  return (
        <div className="w-full flex flex-row gap-4">
            <Card className="basis-1/12 h-fit">
                tags
            </Card>
            <Card className='basis-9/12 truncate min-h-80vh divide-y divide-solid'>
                {post.length && post.map((item, index) => {
                  return (
                        <AEntryItem post={item} key={index}/>
                  )
                })}
            </Card>
            <Card className='basis-2/12 h-fit '>
                adekang
            </Card>
        </div>
  )
}
