### 接口地址
https://www.zybuluo.com/ZhangDi0911/note/1452799

### 开发任务说明
- 焦阳：买卖接口
- 陈开：用户
- 史雪峰：求购
- 陈晨：共享

### 接口开发说明
1. 部分接口的设置可能不是特别合理，如果在发开过程中，发现不合理的地方，在群里及时提出来

2. 对接口返回值的说明，在上面链接的接口文档中，所有的接口 response 都少写了两个字段，分别是 "success" 字段和
"errMsg"字段，以 `获取我的发布`接口为例：
    - 原接口返回值定义如下:
    ```json
    {
        "deal": [{
            "id": "1",
            "time": "8:40",
            "title": "出售全套书柜",
            "description": "刚买不久，全新",
            "images": [
                "http://localhost:8080/images/goods/1/dsggsdgsd/1.jpg",
                "http://localhost:8080/images/goods/1/dsggsdgsd/2.jpg",
                "http://localhost:8080/images/goods/1/dsggsdgsd/3.jpg"
             ],
            "status":"0"
        }],
        "purchase": [{
            "id": "1",
            "time": "14:35",
            "title": "出售书籍《活着》",
            "description": "九成新",
            "status":"0"
        }]
    }
    ```
    - 在开发中的实际返回值:
    ```json
        {
            "success": true,
            "errMsg": "",
            "deal": [{
                "id": "1",
                "time": "8:40",
                "title": "出售全套书柜",
                "description": "刚买不久，全新",
                "images": [
                    "http://localhost:8080/images/goods/1/dsggsdgsd/1.jpg",
                    "http://localhost:8080/images/goods/1/dsggsdgsd/2.jpg",
                    "http://localhost:8080/images/goods/1/dsggsdgsd/3.jpg"
                 ],
                "status":"0"
            }],
            "purchase": [{
                "id": "1",
                "time": "14:35",
                "title": "出售书籍《活着》",
                "description": "九成新",
                "status":"0"
            }]
        }
    ```
