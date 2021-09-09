package com.xiao.controller;/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/6
 */

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xiao.pojo.Books;
import com.xiao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *@Classname BookController
 *@Description TODO
 *@Author 28191
 *@DATE 2021/9/6 23:50
 *@version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service层

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍并且返回到一个书籍展示页面
    @RequestMapping(value = "/allBook",method = RequestMethod.GET)
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";

    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdatePaper(@PathVariable("id") int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updateBook";

    }

    //修改书籍的请求
    @RequestMapping(value = "/updateBook",method = RequestMethod.PUT)
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";

    }

    //查询一本书
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if (books == null){
            list =  bookService.queryAllBook();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }

}
