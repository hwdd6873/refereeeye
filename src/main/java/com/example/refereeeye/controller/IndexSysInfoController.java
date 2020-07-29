package com.example.refereeeye.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexSysInfoController {

    private static Logger logger  = LoggerFactory.getLogger(IndexSysInfoController.class);

    @PostMapping("/index/sysInfo")
    public void systemInfoIndex(){
        logger.info("访问系统状态接口");
    }

}
