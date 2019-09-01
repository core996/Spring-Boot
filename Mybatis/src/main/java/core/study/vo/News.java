package core.study.vo;

import java.io.Serializable;

/**
 * @description: 新闻实体类
 * @author: Xin Wu
 * @create: 2019-08-27 12:55
 **/
public class News implements Serializable {
    private long nid ;
    private String title  ;
    private String content ;
    public long getNid() {
        return nid;
    }

    public void setNid(long nid) {
        this.nid = nid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
