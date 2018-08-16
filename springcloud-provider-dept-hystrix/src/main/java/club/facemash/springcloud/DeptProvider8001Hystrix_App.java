package club.facemash.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//开启eureka客户端
@EnableDiscoveryClient//开启发现客户端
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider8001Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001Hystrix_App.class, args);
    }
}
