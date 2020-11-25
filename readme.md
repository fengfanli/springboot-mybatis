application.yml 不配置数据源会报错，因此需要在主类中 配置：  
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)