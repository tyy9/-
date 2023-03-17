package com.simple.eduservice.controller;

import com.simple.commonutils.entity.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Api(tags = "后台登录接口")
@RequestMapping("/eduservice/user")
public class EduLoginController {
    @ApiModelProperty(value = "登录")
    @PostMapping("/Login")
    public R Login(){
        return R.ok();
    }

    @ApiModelProperty(value = "获取登录信息")
    @GetMapping("/info")
    public R  info(){
        return R.ok().data("roles","admin").data("name","tom")
                .data("avatar","https://himg.bdimg.com/sys/portraitn/item/public.1.1fb494e0.rijXBK-z02nZIjD2iqdGMw");
    }
}
