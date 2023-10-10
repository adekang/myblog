import { Tag } from 'antd'
import type { ArticlePost } from '@/types/article.ts'

interface Props {
  post: ArticlePost
}

export const AEntryItem: React.FC<Props> = (props) => {
  const { post } = props
  console.log(post)

  return (
        <div className='entry-item space-y-1 mb-4 border-solid border-0 border-b-1 border-slate-200'>
            <div className="title text-xl font-semibold leading-normal truncate">{post.title}</div>
            <div className="desc truncate text-font-2">{post.articleSummary}</div>
            <div className="entry-footer flex flex-row gap-4">
                <div className="entry-meta text-font-3">
                    <ul className="flex flex-row gap-4">
                        <li>{post.likeCount}</li>
                        <li>{post.readCount}</li>
                    </ul>
                </div>
                <div className="entry-footer-tags">
                    {post.tags.map((item, index) => {
                      return (
                            <Tag color="blue" key={index}>{item}</Tag>
                      )
                    })}
                </div>
            </div>
        </div>
  )
}
