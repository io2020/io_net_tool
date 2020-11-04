Server API

<br/> 
<br/> 

---
鉴权
```
POST /client/auth/
```

| 参数   | 含义                    |
| ------ | ----------------------- |
| appid | 客户端ID |
| secretKey | 客户端密钥 |
<br/> 

| 返回值   | 含义         |
| ------ | ----------------------- |
| token | 令牌 |  

<br/> 
<br/> 
<br/> 

---
开通端口
```
POST /client/port/open
```
| 参数   | 含义                    |
| ------ | -----------------------|
| token | 令牌 |
| deviceRid | 客户端唯一标识 |
| connectType | 协议类型 |
| port | 客户端协议对应端口号|
| connectTypeN | 协议类型N |
| portN | 客户端协议对应端口号N|


<br/> 


| 返回值   | 含义         |
| ------ | ----------------------- |
| serverIp | nps服务器ip |
|  serverPort | nps服务器端口 |
| connectType | 协议类型 |
| vKey | 协议端口对应密钥 |
| clientId | 客户端id |
| connectId | 隧道id |
| connectTypeN | 协议类型N |
| vKeyN | 协议端口对应密钥N |
| clientIdN | 客户端idN |
| connectIdN | 隧道idN |

<br/> 
<br/> 
<br/> 

---
启动隧道
```
POST /client/port/start
```
| 参数   | 含义                    |
| ------ | -----------------------|
| token | 令牌 |
| deviceRid | 客户端唯一标识 |
| connectType | 协议类型 |
| vKey | 协议端口对应密钥 |

<br/> 
<br/> 
<br/> 

---
停止隧道
```
POST /client/port/stop
```
| 参数   | 含义                    |
| ------ | -----------------------|
| token | 令牌 |
| deviceRid | 客户端唯一标识 |
| connectType | 协议类型 |
| vKey | 协议端口对应密钥 |