package com.example.webadminfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：myspringcloud<br>
 * *********************************<br>
 * <P>类名称：AdminController</P>
 * *********************************<br>
 * <P>类描述：</P>
 * 创建时间：2020/3/26 13:17<br>
 * 修改备注：<br>
 *
 * @version 1.0<br>
 */
@RestController
public class AdminController {
    @Autowired
    private AdminFeign adminFeign;
    @Autowired
    UserFeign  userFeign;
    @RequestMapping(value = "admin")
    public String hi(String m){
        return adminFeign.hi(m);
    }
    @RequestMapping(value = "user")
    public String user(String m){
        return userFeign.hi(m);
    }
}