package club.facemash.springcloud.service;

import club.facemash.springcloud.entities.Dept;

import java.util.List;


public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}

