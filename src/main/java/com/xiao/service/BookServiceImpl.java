package com.xiao.service;/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/6
 */

import com.xiao.dao.BookMapper;
import com.xiao.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Classname BookServiceImpl
 *@Description TODO
 *@Author 28191
 *@DATE 2021/9/6 23:11
 *@version 1.0
 */

public class BookServiceImpl implements BookService{

    
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
