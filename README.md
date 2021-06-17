# solon_api_demo

#### 本案，使用两种风格构建示例：

* style1 采用 Gateway(轻网关)构建接口
* style2 采用 Controller（控制器）构建接口

#### 示例说明

* demo1 : 展示一个 "基于轻网关的接口开发" 最基本开发结构，含单测。
* demo2 : 在 demo1 基础上，增加 1)接口基类、2)异常处理、3)过滤器处
* demo3 : 在 demo2 基础上，增加 1)接口状态码规范化管理、2)接口返回改为直接类型、3)缓存与数据处理 //不能启动；因为数据库之类的是错的配置
* demo4 : 在 demo3 基础上，增加 1)换成JWT session、2)采用xx.xx命名接口名


轻网关的高级定制可以参考：[https://gitee.com/noear/srww/tree/main/srww.uapi](https://gitee.com/noear/srww/tree/main/srww.uapi)
