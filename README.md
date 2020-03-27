#  knd-platform

<p align="center">
  <img src='https://img.shields.io/badge/license-Apache%202-4EB1BA.svg' alt='License'/>
  <img src="https://img.shields.io/badge/Spring%20Boot-2.1.12.RELEASE-blue" alt="Downloads"/>
  <img src="https://img.shields.io/badge/Spring%20Cloud-Greenwich.SR5-blue" alt="Downloads"/>
  <img src="https://img.shields.io/badge/Spring%20Cloud%20Alibaba-2.1.1.RELEASE-blue" alt="Downloads"/>
  <img src="https://img.shields.io/badge/Layui-EasyWeb-yellowgreen" alt="Downloads"/>
</p>



## 1. 项目介绍

* **技术交流群** 

## 2. 项目总体架构图

## 3. 功能介绍

## 4. 模块说明

       项目规划目标为微服务项目和单体项目提供公共的以及业务功能模板化的组件功能；初步规划为两大模块：

  ###1. 公共组件模块

   公共组件模块包括2大子模块：

   - 公共工具性功能模块 
   - 微服务公共组件模块

   ###2. 项目框架组以及组件规范

       主要包括基本业务模块，新增业务模块按照基本业务模块类似方式在这个模块中进行开发
       
         knd-platform -- 公共项目组父级，公共项目和通用服务组件模块
         │  │─knd-commons -- 通用性工具一级工程
         │  │  ├─knd-auth-client-spring-boot-starter -- 封装spring security client端的通用操作逻辑
         │  │  ├─knd-common-core -- 封装通用操作逻辑(通用基本工具、实体类、常用业务类模板、异常、枚举。。。)
         │  │  ├─knd-common-spring-boot-starter -- 封装通用操作逻辑
         │  │  ├─knd-db-spring-boot-starter -- 封装数据库通用操作逻辑
         │  │  ├─knd-log-spring-boot-starter -- 封装log通用操作逻辑
         │  │  ├─knd-redis-spring-boot-starter -- 封装Redis通用操作逻辑
         │  │  ├─knd-ribbon-spring-boot-starter -- 封装Ribbon和Feign的通用操作逻辑
         │  │  ├─knd-sentinel-spring-boot-starter -- 封装Sentinel的通用操作逻辑
         │  │  ├─knd-swagger2-spring-boot-starter -- 封装Swagger通用操作逻辑
         │  │  ├─knd-doc -- 项目文档
         │  │─knd-micro -- 通用微服务组件模块
         │  │  ├─micro-nacos-config -- 配置中心（阿波罗/nacos）
         │  |  ├─micro-gateway -- api网关一级工程
         │  │     ├─scloud-gateway -- spring-cloud-gateway[9900]
         │  │     ├─zuul-gateway -- netflix-zuul[9900]
         │  |  ├─micro-job -- 分布式任务调度一级工程
         │  │     ├─job-admin -- 任务管理器[8081]
         │  │     ├─job-core -- 任务调度核心代码
         │  │     ├─job-executor-samples -- 任务执行者executor样例[8082]
         │  |  ├─micro-monitor -- 监控一级工程
         │  |  │  ├─monitor-admin -- 应用监控[6500]
         │  |  │  ├─monitor-logcenter -- 日志中心[6200]
         │  |  ├─micro-auth2  -- spring-security认证中心[8000]
         │  |  ├─micro-register -- 注册中心Nacos[8848]
         │  |  ├─micro-search -- 分布式事务子模块
         │  |  │  ├─search-client -- 搜索中心客端
         │  |  │  ├─search-server -- 搜索中心服务端[7100]
         │  |  ├─micro-transaction -- 分布式事务子模块
         │  |  │  ├─txlcn-tm-transaction -- tx-lcn事务管理器[7970]
         │  ├─knd-demo -- demo示列一级工程
         │  │  ├─txlcn-demo -- txlcn分布式事务demo
         │  │  ├─seata-demo -- seata分布式事务demo
         │  │  ├─sharding-jdbc-demo -- sharding-jdbc分库分表demo
         │  │  ├─rocketmq-demo -- rocketmq和mq事务demo
         │  │  ├─sso-demo -- 单点登录demo
         
         2.后台业务项目组(初步只有通用业务模板)
         knd-business -- 业务后台项目组
         │   ├─user-center -- 用户中心[7000]
         │   ├─file-center -- 文件中心[5000]
         │   ├─code-generator -- 代码生成器[7300]  
          
         3.前端项目组
         knd-web --前端项目组
         │  ├─back-web  -- 后台管理前端[8066]
         │  ├─front-web -- 前台业务前端[8088] 
         
         4.单体项目组(通用业务模板)
         knd-single --单体项目组
         │  ├─back-web  -- 后台管理前端[8088]
         │  ├─front-web -- 前台业务前端[8099] 
         
## 5. 交流反馈


## 6. 截图（点击可大图预览）
