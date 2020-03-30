package com.example.adminservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：myspringcloud<br>
 * *********************************<br>
 * <P>类名称：AdminController</P>
 * *********************************<br>
 * <P>类描述：</P>
 * 创建时间：2020/3/25 15:00<br>
 * 修改备注：<br>
 *
 * @version 1.0<br>
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private int port;
    @RequestMapping(value = "hi")
    public String hi(String m){
        return m+"  "+port;
    }
}