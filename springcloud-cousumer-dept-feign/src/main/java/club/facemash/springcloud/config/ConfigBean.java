package club.facemash.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    /**
     * 定义 负载均衡的算法，feign底层封装ribbo,所以对ribbo的负载均衡算法可以修改
     * @return
     */
    @Bean
    public IRule myIRule(){
        return  new RandomRule();
    }
}
