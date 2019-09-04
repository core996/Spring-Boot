package core.study.service;

import core.study.vo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @description: 部门业务层接口
 * @author: Xin Wu
 * @create: 2019-09-04 11:55
 **/
@FeignClient("MICRO-DEPT")
public interface IDeptService {

    @GetMapping("/dept/add")
    Dept add(Dept dept) ;

    @GetMapping("/dept/list")
    List<Dept> list() ;

    @GetMapping("/dept/find")
    Dept get(long id) ;
}
