package core.study.dao;


import core.study.vo.News;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 新闻数据层接口
 * @author: Xin Wu
 * @create: 2019-08-27 13:05
 **/
@Mapper
public interface INewsDAO {
    boolean doCreate(News news) ;
    News findById(long id) ;
}
