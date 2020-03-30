package com.example.webadminfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "admin-service",fallback = AdminFeignImpl.class)
public interface AdminFeign {
    @RequestMapping(value = "hi")
     String hi(@RequestParam(value = "m") String m);
}
