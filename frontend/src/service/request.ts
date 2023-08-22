import type {
  AxiosError,
  AxiosRequestConfig,
  AxiosResponse,
  InternalAxiosRequestConfig,
} from 'axios'
import axios from 'axios'

// 响应拦截器
export interface ResponseBody<T = any> {
  code: number
  data?: T
  msg: string
}

const instance = axios.create({
  baseURL: import.meta.env.VITE_APP_BASE_API ?? '/',
  timeout: 50000,
})

// 请求拦截器
async function requestHandler(config: InternalAxiosRequestConfig): Promise<InternalAxiosRequestConfig> {
  // TODO  token
  return config
}

function responseHandler(response: AxiosResponse): ResponseBody<any> | AxiosResponse<any> | Promise<any> | any {
  return response.data
}
function errorHandler(error: AxiosError): Promise<any> {
  // 判断是否存在response
  if (error.response) {
    // const {data, status, statusText} = error.response as AxiosResponse<any>
    const { status } = error.response as AxiosResponse<any>
    if (status === 401) {
      // TODO 重新登录

    }
    else if (status === 403) {
      // TODO 无权限

    }
    else if (status === 500) {
      // TODO 服务器错误
    }
    else {
      // TODO 其他错误
    }
  }
  return Promise.reject(error)
}

instance.interceptors.request.use(requestHandler)
instance.interceptors.response.use(responseHandler, errorHandler)
export default instance

//  p传入数据类型, R响应数据类型
export function useGet<P = any, R = any>(url: string,
  params?: P,
  config?: AxiosRequestConfig): Promise<ResponseBody<R>> {
  return instance.request({
    url,
    method: 'GET',
    params,
    ...config,
  })
}

//  p传入数据类型, R响应数据类型
export function usePost<P = any, R = any>(url: string,
  data?: P,
  config?: AxiosRequestConfig): Promise<ResponseBody<R>> {
  return instance.request({
    url,
    method: 'POST',
    data,
    ...config,
  })
}

export function usePut<P = any, R = any>(url: string,
  data?: P,
  config?: AxiosRequestConfig): Promise<ResponseBody<R>> {
  return instance.request({
    url,
    method: 'PUT',
    data,
    ...config,
  })
}

export function useDelete<P = any, R = any>(url: string,
  data?: P,
  config?: AxiosRequestConfig): Promise<ResponseBody<R>> {
  return instance.request({
    url,
    method: 'DELETE',
    data,
    ...config,
  })
}
