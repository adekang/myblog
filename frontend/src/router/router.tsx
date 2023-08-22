import { createHashRouter } from 'react-router-dom'
import { Home } from '@/pages/Home.tsx'
import { Root } from '@/pages/Root.tsx'
import { NotFound } from '@/pages/NotFound.tsx'

export const router = createHashRouter([
  {
    path: '/',
    element: <Root/>,
    children: [
      {
        path: '/home',
        element: <Home/>,
      },
    ],
  },

  {
    path: '*',
    element: <NotFound/>,
  },
])
