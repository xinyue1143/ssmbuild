/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/7
 */

import com.xiao.pojo.Books;
import com.xiao.service.BookService;
import com.xiao.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@Classname MyTest
 *@Description TODO
 *@Author 28191
 *@DATE 2021/9/7 9:52
 *@version 1.0
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
//        for (Books books : bookServiceImpl.queryAllBook()){
//            System.out.println(books);
        Books books = bookServiceImpl.queryBookById(1);
        System.out.println(books);
        }

}



