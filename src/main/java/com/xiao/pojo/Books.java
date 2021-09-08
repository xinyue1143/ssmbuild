package com.xiao.pojo;/**
 * Description: ssmbuild
 * Created by 28191 on 2021/9/6
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Classname Books
 *@Description TODO
 *@Author 28191
 *@DATE 2021/9/6 17:58
 *@version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
