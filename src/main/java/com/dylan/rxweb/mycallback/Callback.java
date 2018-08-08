package com.dylan.rxweb.mycallback;

/**
 * 场景：老师提问，学生回答问题
 * 我认为本质传递方法或者地址给对方，告诉对方
 *
 * 观察者是主动调用通知所有订阅者 调用别人
 *
 * 回调是，别人调用本身的提供的方法  模块间调用，直接将本身对象传过去
 * 如果只是开启一个线程c去调用a，这样是异步了，但是没有拿到结果
 *
 * serverless 类似函数编程啊
 */
public interface Callback {

    void telAnswer(int answer);
}

