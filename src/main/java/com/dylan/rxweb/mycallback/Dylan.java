package com.dylan.rxweb.mycallback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dylan implements Student {

    private static final Logger logger = LogManager.getLogger(Dylan.class);

    @Override
    public void resovelQuestion(Callback callback) {

        logger.info("er er  uh ");
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("oh i get it ");
        callback.telAnswer(127);
        logger.info("oh i haven tell mss my answer");
    }
}
