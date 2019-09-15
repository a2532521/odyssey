package com.sxk.controller;


import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class PythonOrder {

    public  String getTimeById() throws Exception {
        /*
        String args1 = "python " + "E:\\sbootsecurity\\SpringBoot-Learning\\timedemo\\src\\main\\java\\com\\nickc\\timedemo\\controller\\b.py " + id;
        Process process = Runtime.getRuntime().exec(args1);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));
        String line;
        String result = "";
        while ((line = in.readLine()) != null) {
            result += line;
        }
        in.close();
        process.waitFor();
        System.out.println(result);
        if (result.charAt(0) == '-') {
            return "";
        }
        */
        return "success";
    }

}
