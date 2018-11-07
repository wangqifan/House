package com.wangqifan.house.web.controller;


import com.wangqifan.house.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/get")
    @ResponseBody
    public ApiResponse get()
    {
        return ApiResponse.ofSuccess("成功访问");
    }
}
