package com.example.webadminfeign;

import feign.Feign;
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
public class UserFeignImpl implements UserFeign {
    @Override
    public String hi(String m) {
        return "user失败 "+m;
    }
}