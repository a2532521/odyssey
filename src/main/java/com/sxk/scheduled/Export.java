package com.sxk.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Export {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void minuteExport(){
        System.out.println("每分钟执行一次的任务：" + getDate());
    }

    @Scheduled(fixedRate = 5000)
    public void fiveSecondExport(){
        System.out.println("每5秒执行一次：" + getDate());
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void twoSecondExport(){
        System.out.println("每2秒执行一次：" + getDate());
    }

    @Scheduled(cron = "0 55 14 ? * *")
    public void regularTimeExport(){
        System.out.println("每天上午14点55分执行：" + getDate());
    }

    private String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
