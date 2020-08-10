package demo.component;

import demo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(String name) {
        return name+" error";
    }
}
