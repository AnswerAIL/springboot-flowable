# springboot-flowable
flowable 工作流引擎


## 初始化表结构 - ImportTables
 - act_ru_: 表示的是一些流程实例运行(runtime)时的数据
 - act_hi_: 表示存储的是一些历史(history)数据
 - act_id_: 表示存储的是一些与用户身份(identity)相关的数据
 - act_re_: 表示的是一些流程定义(repository)相关的数据
 - act_ge_: 表示的是一些一般(general)数据
 - act_evt_log表示事件日志，act_prodef_info表示的是流程定义的一些信息。flowable还有一些其它模块中的表，到后面介绍



# 自定义权限管理
如果我们觉得默认的权限管理满足不了我们的需要，或者已经有自己的权限管理系统，则需要额外处理。有2种可以与自己业务兼容的方案：
 - 方案一：同步自己的权限表信息，适配Flowable的表结构，仍然使用IDM提供的服务接口去操作
   - 优点：对Flowable没有侵入性，不需要引入额外的内容
   - 缺点：已经有权限管理系统的时候，如果存在两份数据可能有数据不一致的现象，增加额外的数据维护
 
 - 方案二：自己写代码，实现IdmIdentityService接口，处理自己的权限管理逻辑。官方提供了可以直接使用的LDAP集成方案，我们不一定使用LDAP，但是其中的代码实现比较经典，可以参考一下。
   - 优点：自定义实现，灵活，不管什么权限系统都可以写适配
   - 缺点：如果其他组想接入Flowable，需要引入我们的权限控制实现。
  



# Reference
 - [Flowable Open Source Documentation](https://flowable.com/open-source/docs/bpmn/ch05a-Spring-Boot/)
 - [Flowable BPMN 用户手册 (v 6.3.0)](https://tkjohn.github.io/flowable-userguide/#_introduction)
 - [采用springboot+flowable快速实现工作流](https://blog.csdn.net/puhaiyang/article/details/79845248)
 - [flowable流程引擎初体验，完成一个请假流程](https://www.jianshu.com/p/1e8f915ead55)
 - [Flowable 权限管理](https://www.jianshu.com/p/bbe5ce58577a)