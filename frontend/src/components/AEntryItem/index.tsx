import { Tag } from 'antd'

interface Props {
}

export const AEntryItem: React.FC<Props> = () => {
  return (
        <div className='entry-item space-y-1 mb-4 border-solid border-0 border-b-1 border-slate-200'>
            <div className="title text-xl font-semibold leading-normal truncate">国产自主研发，完全可控 IDE！</div>
            <div className="desc truncate text-font-2">国产自主研发，完全可控 IDE！遥遥领先。 作为一名开发者，自然好奇国产自主研发的
                IDE,我是一个特别固执的人。 我从来不会在意别人跟我说什么，让我去做。 如果你也可以像
            </div>
            <div className="entry-footer flex flex-row gap-4">
                <div className="entry-meta text-font-3">
                    <ul className="flex flex-row gap-4">
                        <li>adekang</li>
                        <li>46k</li>
                        <li>134</li>
                    </ul>
                </div>
                <div className="entry-footer-tags">
                    <Tag>
                        <a href="###">前端</a>
                    </Tag>
                </div>
            </div>
        </div>
  )
}
