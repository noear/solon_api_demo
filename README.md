<h1 align="center" style="text-align:center;">
  Solon for java
</h1>
<p align="center">
	<strong>更现代感的，轻量级应用开发框架</strong>
</p>
<p align="center">
	<a href="https://solon.noear.org/">https://solon.noear.org</a>
</p>

<p align="center">
    <a target="_blank" href="https://search.maven.org/search?q=org.noear%20solon">
        <img src="https://img.shields.io/maven-central/v/org.noear/solon.svg?label=Maven%20Central" alt="Maven" />
    </a>
    <a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.txt">
		<img src="https://img.shields.io/:license-Apache2-blue.svg" alt="Apache 2" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/JDK-8+-green.svg" alt="jdk-8+" />
	</a>
    <br />
    <a target="_blank" href='https://gitee.com/noear/solon/stargazers'>
		<img src='https://gitee.com/noear/solon/badge/star.svg' alt='gitee star'/>
	</a>
    <a target="_blank" href='https://github.com/noear/solon/stargazers'>
		<img src="https://img.shields.io/github/stars/noear/solon.svg?logo=github" alt="github star"/>
	</a>
</p>

<br/>
<p align="center">
	<a href="https://jq.qq.com/?_wv=1027&k=kjB5JNiC">
	<img src="https://img.shields.io/badge/QQ交流群-22200020-orange"/></a>
</p>


<hr />

启动快 5 ～ 10 倍；qps 高 2～ 3 倍；运行时内存节省 1/3 ~ 1/2；打包可以缩到 1/2 ~ 1/10


<hr />

## solon_api_demo

#### 本案，使用两种风格构建示例：

* style1 采用 Gateway(轻网关)构建接口
* style2 采用 Controller（控制器）构建接口

#### 示例说明

* demo1 : 展示一个 "基于轻网关的接口开发" 最基本开发结构，含单测。
* demo2 : 在 demo1 基础上，增加 1)接口基类、2)异常处理、3)过滤器处
* demo3 : 在 demo2 基础上，增加 1)接口状态码规范化管理、2)接口返回改为直接类型、3)缓存与数据处理 //不能启动；因为数据库之类的是错的配置
* demo4 : 在 demo3 基础上，增加 1)换成JWT session、2)采用xx.xx命名接口名、3)增加锁、防重复提交


#### 轻网关的高级定制可以参考：

[https://gitee.com/noear/marsh/tree/main/marsh.uapi](https://gitee.com/noear/marsh/tree/main/marsh.uapi)
