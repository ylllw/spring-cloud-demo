package demo.service;

import demo.component.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo2",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value="hello",method= RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);

}
