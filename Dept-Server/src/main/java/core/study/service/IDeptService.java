package core.study.service;

import core.study.vo.Dept;

import java.util.List;

/**
 * @description: 雇员业务层接口
 * @author: Xin Wu
 * @create: 2019-09-03 11:43
 **/
public interface IDeptService {
    Dept add(Dept dept) ;
    List<Dept> list() ;
    Dept get(long id) ;
}
