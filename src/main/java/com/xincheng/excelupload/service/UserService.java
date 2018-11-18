package com.xincheng.excelupload.service;

import com.xincheng.excelupload.model.ResultObject;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName:UserService
 * Package:com.xincheng.excelupload.service
 * Description:
 *
 * @Date:2018/11/17 20:33
 * @Author: 郑军
 */
public interface UserService {

    ResultObject uploadExcel(MultipartFile file);

}
