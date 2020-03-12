# elasticjob-spring-boot-starter
封装es-job组件，方便可用

## 使用说明
- 下载该项目，编译install
```java
mvn install

```

- 新项目中引入依赖
```java
        <dependency>
            <groupId>com.kevin</groupId>
            <artifactId>elasticjob-spring-boot-starter</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

- 开启elasticjob `@EnableElasticJob`

```java

@EnableElasticJob
@SpringBootApplication
public class EsJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsJobApplication.class, args);
    }

}

```

- 配置对应的job

```java
@Component
@ElasticJobConfig(
        name = "com.kevin.task.task.MySimpleJob",
        cron = "0/5 * * * * ?",
        description = "测试简单任务",
        overwrite = true,
        eventTraceRdbDataSource = "dataSource",
        shardingTotalCount = 2
)
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("执行mysimpleJob====");
    }
}

```

具体使用样例请看demo