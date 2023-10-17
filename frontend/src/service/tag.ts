import { useGet } from '@/service/request.ts'

export interface TagInfo {
  tagId: number
  tagName?: string
  aliasName?: string
  description?: string
}

export const tagApi = {
  findAllTagApi: '/tag/findAll',
}

export const findAllTagApi = () => useGet<any, TagInfo[]>(tagApi.findAllTagApi)
