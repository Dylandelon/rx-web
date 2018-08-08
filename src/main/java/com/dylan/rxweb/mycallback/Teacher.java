package com.dylan.rxweb.mycallback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Teacher implements  Callback
{
    private static final Logger logger = LogManager.getLogger(Teacher.class);

    private  Student student;

    public Teacher(Student student) {
        this.student = student;
    }
    public  void askQuestion(){
        logger.info("the teacher ask questions thread start");
        new Thread(new Runnable() {
            @Override
            public void run() {
                logger.info("the teacher ask questions start");
//                student.resovelQuestion(this);
                student.resovelQuestion(Teacher.this);
                logger.info("the teacher ask questions end");
            }
        }).start();
        logger.info("the teacher ask questions thread end");

    }

    @Override
    public void telAnswer(int answer) {

        logger.info("student answer is:"+answer);
    }

}
