package core.study.vo;

import java.io.Serializable;

/**
 * @description: 部门实体类
 * @author: Xin Wu
 * @create: 2019-09-03 10:48
 **/
public class Dept implements Serializable {
    private Long deptno ;
    private String dname ;
    private String loc ;

    public Long getDeptno() {
        return deptno;
    }
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
