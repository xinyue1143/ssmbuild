package com.xiao.dao;

import com.xiao.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/6
 */

public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId")int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId")int id);

    //查询全部图书
    List<Books> queryAllBook();

    //按名字查询图书
    Books queryBookByName(@PathVariable("bookName")String bookName);

}
