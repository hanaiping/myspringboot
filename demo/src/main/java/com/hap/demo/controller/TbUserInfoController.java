package com.hap.demo.controller;

import com.hap.demo.entity.TbUserInfo;
import com.hap.demo.service.TbUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author aiPing
 * @since 2020-6-30
 */
@RestController
@RequestMapping("/tbUserInfo")
@Api(value = "用户信息接口列表", tags = "用户信息接口列表")
@CrossOrigin
@Slf4j
public class TbUserInfoController {


    @Autowired
    private TbUserInfoService tbUserInfoService;

    @GetMapping(value = "/getUserInfoByUserId")
    @ApiOperation(value = "获取本人的信息", response = TbUserInfo.class)
    public TbUserInfo getUserInfoByUserId(Long userId) {
        return tbUserInfoService.getUserInfo(userId);
    }


}
