package shyeang.springCloud.consum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("-------start--------");
        String result = helloRemote.hello(name);
        System.out.println("-------end--------" +  result);
        return "-------end--------" +  result;
    }

}
