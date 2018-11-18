package com.xincheng.excelupload.model;

/**
 * ClassName:ResultObject
 * Package:com.xincheng.excelupload.model
 * Description:
 *
 * @Date:2018/11/17 20:34
 * @Author: 郑军
 */
public class ResultObject {

    /**
     * 返回的结果的编码
     */
    private Integer code;

    /**
     * 返回的结果的信息
     */
    private String message;

    @Override
    public String toString() {
        return "ResultObject{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
