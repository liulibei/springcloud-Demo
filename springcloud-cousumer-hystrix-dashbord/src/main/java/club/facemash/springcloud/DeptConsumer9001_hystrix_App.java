package club.facemash.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//开启hystrix 仪表盘
public class DeptConsumer9001_hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001_hystrix_App.class,args);
    }

}
