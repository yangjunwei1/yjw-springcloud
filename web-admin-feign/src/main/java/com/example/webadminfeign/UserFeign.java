package com.example.webadminfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserFeignImpl.class)
public interface UserFeign {
    @RequestMapping(value = "hi")
     String hi(@RequestParam(value = "m") String m);
}
