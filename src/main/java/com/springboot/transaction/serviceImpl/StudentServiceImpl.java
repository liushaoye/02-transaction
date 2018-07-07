package com.springboot.transaction.serviceImpl;

import com.springboot.transaction.mapper.StudentMapper;
import com.springboot.transaction.model.Student;
import com.springboot.transaction.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:01-springboot-mybatis  </p>
 * @ClassName :  StudentServiceImpl
 * @date : 2018/7/8 0008
 * @time : 5:11
 * @createTime 2018-07-08 5:11
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    /**
     * 修改一个学生
     *
     * @return
     */
    @Transactional
    @Override
    public int updateStudent() {

        Student student = new Student();
        student.setId(1);
        student.setAge(299);
        student.setName("更新成功");

        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
