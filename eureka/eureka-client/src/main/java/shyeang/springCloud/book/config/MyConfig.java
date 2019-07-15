package shyeang.springCloud.book.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced//使用负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
