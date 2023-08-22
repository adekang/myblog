import { useGet } from '@/service/request.ts'

export interface UserInfo {
  username: string
  nickname?: string
}

export const userApi = {
  getApi: '/get',
  findAllApi: '/users/findAll',
}

// export function userPostInfoApi(params: any) {
//   return usePost<any, any>(userApi.findAllApi, params)
// }

export function userGetInfoApi() {
  return useGet<any, UserInfo>(userApi.getApi)
}

export const userFindAllApi = () => useGet<any, any>(userApi.findAllApi)
