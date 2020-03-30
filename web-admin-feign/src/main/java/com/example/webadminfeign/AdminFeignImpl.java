package com.example.webadminfeign;

import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.stereotype.Component;

/**
 * 项目名称：myspringcloud<br>
 * *********************************<br>
 * <P>类名称：AdminFeignImpl</P>
 * *********************************<br>
 * <P>类描述：</P>
 * 创建时间：2020/3/26 15:58<br>
 * 修改备注：<br>
 *
 * @version 1.0<br>
 */
@Component
public class AdminFeignImpl implements AdminFeign {
    @Override
    public String hi(String m) {
        return "admin失败 "+m;
    }
}