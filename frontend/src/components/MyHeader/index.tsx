import './index.css'
import { Space } from 'antd'
import { Link } from 'react-router-dom'

const MyHeader = () => {
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
                            <div>写文章</div>
                            <div>登录</div>
                        </Space>
                    </div>
                </nav>
            </div>

        </div>
  )
}

export default MyHeader
