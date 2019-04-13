## 发布模块

### 获得发布二手商品界面、求购界面的商品分类信息
**url：**
`GET: /whufleamarket/publish/getcategories`

**response：** `200`
```
{
    "error_code": 0,
    "msg": "ok",
    "categories": [
            {
		"categoryId": "1",
		"categoryName": "运动器材"
	    },
	    {
		"categoryId": "2",
		"categoryName": "化妆品"
	    }
    ]
}
```
**response_description：**
- categoryId：商品种类id
- categoryName：商品名称

### 发布二手商品
**url：**
`POST: /whufleamarket/publish/publishsecondhandgoods`  
**parameters：**
```
{
        "userId": "11",
	"secondhandGoods": {
		"name": "索尼数码相机",
	    	"desc": "用了半年，9成新，完好无损",
	    	"isNew": "false",
	    	"position": {
	    	    "positionName": "武汉大学信息学部",
	    	    "latitude": "123.12",
	    	    "longitude": "123.12"
	    	},
	    	"images":[
	    	    "0101...",
	    	    "0111...",
	    	    "1110..."
	    	],
	    	"categoryId": "1",
	    	"price": "2399",
	    	"publish_pattern":"0"
	}
}
```
**request_description：**

 - userId: 用户id
 - secondhandGoods: 二手商品信息
    - name：商品标题
    - desc：商品描述
    - isNew：为布尔值，是否为全新
    - position：位置信息
      - positionName：位置名称
      - latitude：纬度
      - longitude：经度
    - images：用户上传的图片文件，必须为四张，对应数组中的四个二进制文件序列
    - categoryId：商品种类id
    - price：价格
    - publish_pattern：发布模式

**response：** `200`
```
{
        "error_code": 0,
        "msg": "ok"
}
```
**response_description：**

 - error_code：错误码，0代表正常
 - msg：响应信息

### 发布求购信息
**url：**
`POST: /whufleamarket/publish/publishtobuy`  
**parameters：**
```
{
        "userId": "11",
	"goods": {
	    	"desc": "求购索尼相机",
	    	"position": {
	    	    "positionName": "武汉大学信息学部",
	    	    "latitude": "123.12",
	    	    "longitude": "123.12"
	    	},
	    	"hasImages": "true",
	    	"images":[
	    	    "0101...",
	    	    "0111...",
	    	    "1110..."
	    	],
	    	"categoryId": "1",
	    	"price": "2399",
	    	"buy_pattern":"0"
	}
}
```
**request_description：**

 - userId: 用户id
 - goods: 求购商品信息
    - desc：商品描述
    - position：位置信息
      - positionName：位置名称
      - latitude：纬度
      - longitude：经度
    - hasImages：用户是否上传图片，若为false，则请求中不包含images字段，否则包含images字段，对应的属性为文件二进制序列
    - images：用户上传的图片文件，最多上传四张，该字段对应属性为文件的二进制数组
    - categoryId：商品种类id
    - price：价格
    - buy_pattern：交易模式

**response：** `200`
```
{
        "error_code": 0,
        "msg": "ok"
}
```
**response_description：**

 - error_code：错误码，0代表正常
 - msg：响应信息