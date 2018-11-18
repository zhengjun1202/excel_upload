package com.xincheng.excelupload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelUploadApplication {

    private static final Logger logger = LoggerFactory.getLogger(ExcelUploadApplication.class);

    public static void main(String[] args) {

        logger.info("---------项目启动了-------------");
        SpringApplication.run(ExcelUploadApplication.class, args);
        logger.info("---------项目启动成功-----------");
    }
}
