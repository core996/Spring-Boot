package core.study.controller;

import core.study.service.IDeptService;
import core.study.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 部门控制层
 * @author: Xin Wu
 * @create: 2019-09-03 11:48
 **/
@RestController
public class DeptRest {

    @Autowired
    private IDeptService deptService ;

    @RequestMapping("/dept/add")
    public Object add(Dept dept){
        return this.deptService.add(dept) ;
    }

    @RequestMapping("/dept/list")
    public Object list(){
        return this.deptService.list() ;
    }

    @RequestMapping("/dept/find")
    public Object find(long id){
        return this.deptService.get(id) ;
    }
}
