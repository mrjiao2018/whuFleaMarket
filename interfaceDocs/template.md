# 接口模板
所有接口的定义请严格遵守此模板，以下为一个具体的接口示例：

## 买卖
### 获取平台当前所有的买卖
**url：**
`GET: /whufleamarket/deals/all`  
**response：** `200`
```
[
    {
		"id": "1",
		"owner": {
			"id": "1",
			"name": "张三",
			"headSrc": "http://localhost:8080/images/users/1.jpg",
			"school": "国际软件学院"
		},
		"category": "1",
		"mode": "proxy",
		"address": "C7舍",
		"time": "8:40",
		"title": "出售全套书柜",
		"description": "刚买不久，全新",
		"images": [
			"http://localhost:8080/images/goods/1/dsggsdgsd/1.jpg",
			"http://localhost:8080/images/goods/1/dsggsdgsd/2.jpg",
			"http://localhost:8080/images/goods/1/dsggsdgsd/3.jpg"
		]，
		"status":"0"
	},
	{
		"id": "2",
		"owner": {
			"id": "4",
			"name": "李四",
			"headSrc": "http://localhost:8080/images/users/4.jpg",
			"school": "文学院"
		},
		"category": "2",
		"mode": "free",
		"address": "枫园17舍",
		"time": "17:40",
		"title": "出售《活着》",
		"description": "作者：余华",
		"images": [
			"http://localhost:8080/images/goods/2/dsgsdsd/1.jpg",
			"http://localhost:8080/images/goods/2/dsgsdsd/2.jpg",
			"http://localhost:8080/images/goods/2/dsgsdsd/3.jpg"
		],
		"status":"0"
	}
]
```
**response_description：**

 - id: 买卖编号
 - owner: 买卖发布者信息
    - id：发布者编号
    - name：发布者姓名
    - headSrc：发布者头像图片地址
    - school：发布者所在学院
 - category：买卖种类
    - '1'：“家电”
    - '2'：“植物”
    - '3'：“食品”
    - '4'：“专业书”
    - '5'：“电影票”
    - '6'：“化妆品”
    - '7'：“文学作品”
    - '8'：“宿舍神器”
    - '9'：“健身器材”
    - '10'：“体育用品”
    - '11'：“cosplay”服装
    - '12'：“其他”
 - mode：买卖类型
    - '1'：“代理点”
    - '2'：“自由发布”
 - address：买卖地址
 - time：买卖发布时间
 - title：买卖物品标题
 - description：买卖物品简要描述
 - images：买卖物品展示图片，是一个数组
 - status: 订单状态
    - '0'：“进行中”
    - '1'：“已完成”

### 买卖下单
**url：**
`POST: /whufleamarket/deals/<String:dealID>/commit`  
**parameters：**
```
{
    	"dealID": "23",
   	"userID": "11",
	"consignee": {
		"phone": "15287876661",
	    	"name": "李四",
	    	"address": "C7宿舍代理点"
	}
}
```
**response：** `201`
```
{
        "error_code": 0,
        "msg": "ok",
        "request": "/whufleamarket/deals/<String:dealID>/commit"
}
```
**response_description：**

 - userID：当前下单用户的ID
 - dealID：当前买卖的ID
 - consignee：收货人的信息
    - phone：收货人呢电话
    - name：收货人姓名
    - address：收货代理点地址

 
 
