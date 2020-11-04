NPS API 
https://ehang-io.github.io/nps/#/webapi

<br/> 
<br/> 

---
获取客户端列表
```
POST /client/list/
```

| 参数   | 含义                    |
| ------ | ----------------------- |
| search | 搜索                    |
| order  | 排序 asc 正序 desc 倒序 |
| offset | 分页(第几页)            |
| limit  | 条数(分页显示的条数)    |

<br/> 
<br/> 
<br/> 

---
获取单个客户端


```
POST /client/getclient/
```

| 参数 | 含义      |
| ---- | --------- |
| id   | 客户端 id |

<br/> 
<br/> 
<br/>

---

添加客户端

```
POST /client/add/
```

| 参数              | 含义                                             |
| ----------------- | ------------------------------------------------ |
| remark            | 备注                                             |
| u                 | basic 权限认证用户名                             |
| p                 | basic 权限认证密码                               |
| limit             | 条数(分页显示的条数)                             |
| vkey              | 客户端验证密钥                                   |
| config_conn_allow | 是否允许客户端以配置文件模式连接 1 允许 0 不允许 |
| compress          | 压缩 1 允许 0 不允许                             |
| crypt             | 是否加密（1 或者 0）1 允许 0 不允许              |
| rate_limit        | 带宽限制 单位 KB/S 空则为不限制                  |
| flow_limit        | 流量限制 单位 M 空则为不限制                     |
| max_conn          | 客户端最大连接数量 空则为不限制                  |
| max_tunnel        | 客户端最大隧道数量 空则为不限制                  |

<br/> 
<br/> 
<br/>

---

修改客户端

```
POST /client/edit/
```

| 参数              | 含义                                             |
| ----------------- | ------------------------------------------------ |
| remark            | 备注                                             |
| u                 | basic 权限认证用户名                             |
| p                 | basic 权限认证密码                               |
| limit             | 条数(分页显示的条数)                             |
| vkey              | 客户端验证密钥                                   |
| config_conn_allow | 是否允许客户端以配置文件模式连接 1 允许 0 不允许 |
| compress          | 压缩 1 允许 0 不允许                             |
| crypt             | 是否加密（1 或者 0）1 允许 0 不允许              |
| rate_limit        | 带宽限制 单位 KB/S 空则为不限制                  |
| flow_limit        | 流量限制 单位 M 空则为不限制                     |
| max_conn          | 客户端最大连接数量 空则为不限制                  |
| max_tunnel        | 客户端最大隧道数量 空则为不限制                  |
| id                | 要修改的客户端 id                                |

<br/> 
<br/> 
<br/>

---
删除客户端

```
POST /client/del/
```

| 参数 | 含义              |
| ---- | ----------------- |
| id   | 要删除的客户端 id |

<br/> 
<br/> 
<br/>

---
获取单条隧道信息

```
POST /index/getonetunnel/
```

| 参数 | 含义      |
| ---- | --------- |
| id   | 隧道的 id |

<br/> 
<br/> 
<br/>

---
获取隧道列表

```
POST /index/gettunnel/
```

| 参数      | 含义                                    |
| --------- | --------------------------------------- |
| client_id | 穿透隧道的客户端 id                     |
| type      | 类型 tcp udp httpProx socks5 secret p2p |
| search    | 搜索                                    |
| offset    | 分页(第几页)                            |
| limit     | 条数(分页显示的条数)                    |

<br/> 
<br/> 
<br/>

---
添加隧道

```
POST /index/add/
```

| 参数      | 含义                                    |
| --------- | --------------------------------------- |
| type      | 类型 tcp udp httpProx socks5 secret p2p |
| remark    | 备注                                    |
| port      | 服务端端口                              |
| target    | 目标(ip:端口)                           |
| client_id | 客户端 id                               |

<br/> 
<br/> 
<br/>

---
修改隧道

```
POST /index/edit/
```

| 参数      | 含义                                    |
| --------- | --------------------------------------- |
| type      | 类型 tcp udp httpProx socks5 secret p2p |
| remark    | 备注                                    |
| port      | 服务端端口                              |
| target    | 目标(ip:端口)                           |
| client_id | 客户端 id                               |
| id        | 隧道 id                                 |

<br/> 
<br/> 
<br/>

---
删除隧道

```
POST /index/del/
```

| 参数 | 含义    |
| ---- | ------- |
| id   | 隧道 id |

<br/> 
<br/> 
<br/>

---
隧道停止工作

```
POST /index/stop/
```

| 参数 | 含义    |
| ---- | ------- |
| id   | 隧道 id |

<br/> 
<br/> 
<br/>

---
隧道开始工作
```
POST /index/start/
```

| 参数 | 含义    |
| ---- | ------- |
| id   | 隧道 id |
