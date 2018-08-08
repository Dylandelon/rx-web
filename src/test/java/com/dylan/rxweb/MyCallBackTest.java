package com.dylan.rxweb;

import com.dylan.rxweb.mycallback.Dylan;
import com.dylan.rxweb.mycallback.Student;
import com.dylan.rxweb.mycallback.Teacher;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class MyCallBackTest {

//    @Test
    public void testCallback(){
        Student student = new Dylan();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }

    public static void main(String[] args) {
        Student student = new Dylan();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }
}
