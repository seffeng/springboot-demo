package com.example.scheduled.crontab;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TaskTwo {

    @Scheduled(fixedRate = 6000)
    public void testOne() {
        Date d = new Date();
        System.out.println(d.toString() + " ==========task--22222--test--11111==========");
    }

    @Scheduled(cron = "05 * * * * *")
    public void testTwo() {
        Date d = new Date();
        System.out.println(d.toString() + " ==========task--22222--test--22222==========");
    }
}
