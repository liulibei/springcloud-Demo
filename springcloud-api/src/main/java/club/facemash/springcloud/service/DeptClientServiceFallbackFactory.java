package club.facemash.springcloud.service;


import club.facemash.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("现在服务器忙！请稍后再试！").setDb_source("NO DB");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
