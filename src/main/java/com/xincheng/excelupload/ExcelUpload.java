package com.xincheng.excelupload;

import com.xincheng.excelupload.model.ResultObject;
import com.xincheng.excelupload.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 * ClassName:ExcelUpload
 * Package:com.xincheng.excelupload
 * Description: excel文件上传
 *
 * @Date:2018/11/17 0:31
 * @Author: 郑军
 */
@Controller
public class ExcelUpload {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExcelUpload.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/excelUpload")
    @ResponseBody
    public ResultObject uploadExcel(@RequestParam("file")MultipartFile file) {

        LOGGER.info("文件上传了");
        ResultObject resultObject = userService.uploadExcel(file);

        return resultObject;
    }

}
