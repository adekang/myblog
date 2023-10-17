import { Button, Space } from 'antd'
import { Link, useNavigate } from 'react-router-dom'
import './index.css'

const MyHeader = () => {
  const navigate = useNavigate()
  const handleGo = () => {
    navigate('/editor')
  }

  return (
        <div className="container">
            <div className="logo">logo</div>
            <div className="main-nav">
                <nav className="nav-list">
                    <div className="left-side-nav">
                        <Space>
                            <Link to="/">首页</Link>
                            <Link to="/home">友链</Link>
                            <Link to="/home">关于</Link>
                        </Space>
                    </div>
                    <div className="right-side-nav">
                        <Space>
                            <div>搜索框</div>
                            <Button onClick={handleGo}>写文章</Button>
                            <div>登录</div>
                        </Space>
                    </div>
                </nav>
            </div>

        </div>
  )
}

export default MyHeader
