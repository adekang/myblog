import { useGet } from '@/service/request.ts'
import type { ArticlePost } from '@/types/article.ts'

const articleApi = {
  articlePostApi: '/article/findAllPost',
}

export function articlePostApi() {
  return useGet<any, ArticlePost[]>(articleApi.articlePostApi)
}
