package com.xiao.service;

import com.xiao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/6
 */
public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部图书
    List<Books> queryAllBook();

    //按名字查询图书
    Books queryBookByName(String bookName);
}
