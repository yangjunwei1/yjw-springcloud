package com.example.webadminfeign;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 项目名称：myspringcloud<br>
 * *********************************<br>
 * <P>类名称：HyServerlet</P>
 * *********************************<br>
 * <P>类描述：</P>
 * 创建时间：2020/3/26 16:16<br>
 * 修改备注：<br>
 *
 * @version 1.0<br>
 */
@Component
public class HyServerlet {
    @Bean
    public ServletRegistrationBean gets(){
        HystrixMetricsStreamServlet hy=new HystrixMetricsStreamServlet();
        ServletRegistrationBean sBen=new ServletRegistrationBean(hy);
        sBen.setLoadOnStartup(1);
        sBen.setName("hy");
        sBen.addUrlMappings("/hystrix.stream");
        return sBen;
    }
}