export interface ArticlePost {
  title: string
  readCount: number
  likeCount: number
  articleSummary: string
  tags: Record<string, any>[]
}
