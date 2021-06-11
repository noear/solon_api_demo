
##### Demo2。在 Demo1 基础上，增加了 1)异常处理、2)过滤器处


执行之后，可打开以下地址测试：

* 正常接口：

[http://localhost:8082/api/hello?name=noear&t=1](http://localhost:8081/api/hello?name=noear&t=1)

[http://localhost:8082/api/hello?name=noear](http://localhost:8081/api/hello?name=noear)


* 出错接口：

[http://localhost:8082/api/error?t=1](http://localhost:8081/api/error?t=1)

[http://localhost:8082/api/error](http://localhost:8081/api/error)

* 不存在接口（都是提示接口不存在）

[http://localhost:8082/api/?t=1](http://localhost:8081/api/?t=1)

[http://localhost:8082/api/xxx/zzz?t=1](http://localhost:8081/api/xxx/zzz?t=1)


[http://localhost:8082/api/](http://localhost:8081/api/)

[http://localhost:8082/api/xxx/zzz](http://localhost:8081/api/xxx/zzz)

