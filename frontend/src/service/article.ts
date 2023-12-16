import { useGet, usePost } from '@/service/request.ts'
import type { ArticlePost } from '@/types/article.ts'

const articleApi = {
  articlePostApi: '/article/findAllPost',
  articleAddPostApi: '/article/addPost',
}

export function articlePostApi() {
  return useGet<any, ArticlePost[]>(articleApi.articlePostApi)
}

export function articleAddPostApi(data: any) {
  return usePost(articleApi.articleAddPostApi, data)
}
