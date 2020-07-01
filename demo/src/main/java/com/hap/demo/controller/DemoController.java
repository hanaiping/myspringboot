package com.hap.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(tags = "测试接口文档")
@Slf4j
public class DemoController {

    @GetMapping("/get")
    @ApiOperation("查询")
    public String get() {
        return "hello";
    }
}
