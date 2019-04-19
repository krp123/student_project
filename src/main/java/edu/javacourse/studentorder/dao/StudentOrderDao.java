package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.DaoExeption;

import java.util.List;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoExeption;

    List<StudentOrder> getStudentOrders() throws DaoExeption;
}
