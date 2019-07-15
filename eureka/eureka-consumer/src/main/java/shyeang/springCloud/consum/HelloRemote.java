package shyeang.springCloud.consum;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "demo-service")
public interface  HelloRemote {
    //restful api 调用
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name);
}
