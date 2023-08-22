import { Layout } from 'antd'
import React from 'react'
import { Outlet } from 'react-router-dom'
import MyHeader from '@/components/MyHeader'

interface Props {
}

const MyLayout: React.FC<Props> = () => {
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
                <Content className="container mx-auto">
                    <Outlet/>
                </Content>
            </Layout>
        </>
  )
}

export default MyLayout
