package core.study.dao;

import core.study.vo.Dept;
import org.springframework.stereotype.Component;



import java.util.List;

/**
 * @description: 部门数据层接口
 * @author: Xin Wu
 * @create: 2019-09-03 10:55
 **/

@Component
public interface IDeptDAO {

    boolean doCreate(Dept dept) ;

    List<Dept> findAll () ;

    Dept findById(Long id) ;
}
