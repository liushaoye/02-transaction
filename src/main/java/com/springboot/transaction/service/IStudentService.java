package com.springboot.transaction.service;

import com.springboot.transaction.model.Student;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:01-springboot-mybatis  </p>
 * @ClassName :  IStudentService
 * @date : 2018/7/8 0008
 * @time : 5:11
 * @createTime 2018-07-08 5:11
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public interface IStudentService {

    /**
     * 获取所有学生
     *
     * @return
     */
    List<Student> selectAllStudent();

    /**
     * 修改一个学生
     *
     * @return
     */
    int updateStudent();
}
