package club.facemash.springcloud.service;

import club.facemash.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
//定义feign 负载均衡的客户端 value：微服务的名字  fallbackFactory:定义 消费者端的 Fallback处理
@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();
}

