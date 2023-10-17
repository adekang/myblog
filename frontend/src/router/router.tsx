import { createHashRouter } from 'react-router-dom'
import { Home } from '@/pages/Home.tsx'
import { Root } from '@/pages/Root.tsx'
import { NotFound } from '@/pages/NotFound.tsx'
import MyLayout from '@/layouts/Layout'
import { MyEditor } from '@/pages/Editor'

export const router = createHashRouter([
  {
    path: '/',
    element: <MyLayout/>,
    children: [
      { index: true, element: <Root/> },
      {
        path: '/home',
        element: <Home/>,
      },
      {
        path: '/editor',
        element: <MyEditor/>,
      },
    ],
  },

  {
    path: '*',
    element: <NotFound/>,
  },
])
