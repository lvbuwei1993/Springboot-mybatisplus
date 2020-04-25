package com.util;

import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lvhong on 2019/5/18.
 */
public class ResultUtil {


    private Integer code = 200;// 操作结果提示码，200：成功；400：失败；500：服务器内部错误
    private  Integer status = 0;
    private Boolean success = true;// 操作结果

    private Object data;// 存放操作成功后的数据，或者失败后的提示

    private String msg;// 操作提醒

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        if (code == 200) {
            this.success = true;
        } else {
            this.success = false;
        }
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        if (success) {
            code = 200;
        } else {
            code = 400;
        }
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setData(Object object, Page page) {
        Map<String, Object> data = new HashMap<String, Object>();
        if (object instanceof List) {
            data.put("list", object);
        } else {
            data.put("result", object);
        }
        data.put("page", page);
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
