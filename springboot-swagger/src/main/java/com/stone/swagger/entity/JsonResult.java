package com.stone.swagger.entity;

import lombok.Data;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/1
 * @Email zou.shiyong@frontsurf.com
 */
@Data
public class JsonResult {

    private String status = null;
    private Object result = null;
}
