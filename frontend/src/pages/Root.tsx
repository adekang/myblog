import { Layout } from 'antd'
import React from 'react'
import { Outlet } from 'react-router-dom'
import MyHeader from '@/components/MyHeader'

interface Props {
}

export const Root: React.FC<Props> = () => {
  const {
    Header,
    Content,
  } = Layout

  const headerStyle: React.CSSProperties = {
    textAlign: 'center',
    backgroundColor: '#fff',
  }
  return (
        <>
            <Layout>
                <Header style={headerStyle}>
                    <MyHeader/>
                </Header>
                <Content>
                    <Outlet/>
                </Content>
            </Layout>
        </>
  )
}
