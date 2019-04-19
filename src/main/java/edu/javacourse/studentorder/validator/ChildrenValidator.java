package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("ChildrenCheck is running");
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
