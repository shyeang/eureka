package shyeang.springCloud.book.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //restful api方式
    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name){
        String  ss = "hello!" + name;
        System.out.println("----------:" + ss + ":------------");
        return ss;
    }
}
