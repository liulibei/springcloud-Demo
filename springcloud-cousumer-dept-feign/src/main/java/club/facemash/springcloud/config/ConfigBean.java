package club.facemash.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    /**
     * 定义 负载均衡的算法
     * @return
     */
    @Bean
    public IRule myIRule(){
        return  new RandomRule();
    }
}
