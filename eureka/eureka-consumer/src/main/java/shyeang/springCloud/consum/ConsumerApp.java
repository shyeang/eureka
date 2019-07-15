package shyeang.springCloud.consum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
@SpringBootApplication
public class ConsumerApp {
    //@Bean 应用在方法上，用来将方法返回值设为为bean
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String args[]){
        SpringApplication.run(ConsumerApp.class, args);
    }
}
