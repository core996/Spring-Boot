package core.study.service.impl;

import core.study.dao.IDeptDAO;
import core.study.service.IDeptService;
import core.study.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 部门业务层实现类
 * @author: Xin Wu
 * @create: 2019-09-03 11:44
 **/
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDAO deptDAO ;

    @Override
    public Dept add(Dept dept) {
        if (this.deptDAO.doCreate(dept)){
            return dept ;
        }
        return null;
    }

    @Override
    public List<Dept> list() {
        return this.deptDAO.findAll();
    }

    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }
}
