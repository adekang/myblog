import React from 'react'
import { Card } from 'antd'
import { AEntryItem } from '@/components/AEntryItem'

interface Props {
}

export const Root: React.FC<Props> = () => {
  return (
        <div className="w-full flex flex-row gap-4">
            <Card className="basis-1/12 h-fit">
                tags
            </Card>
            <Card className='basis-9/12 truncate min-h-80vh divide-y divide-solid'>
                <AEntryItem/>
                <AEntryItem/>
                <AEntryItem/>
                <AEntryItem/>
                <AEntryItem/>
                <AEntryItem/>
            </Card>
            <Card className='basis-2/12 h-fit '>
                adekang
            </Card>
        </div>
  )
}
