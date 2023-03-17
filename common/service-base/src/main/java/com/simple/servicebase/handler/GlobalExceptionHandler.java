package com.simple.servicebase.handler;


import com.simple.commonutils.entity.R;
import com.simple.servicebase.excpetion.CustomerException;
import com.simple.servicebase.utils.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@ResponseBody
@ControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public R excpetionHandler(Exception e){
        e.printStackTrace();
        return R.error().message("执行全局异常");
    }

    @ExceptionHandler(CustomerException.class)
    public R CustomerExceptionHandler(CustomerException e){
        log.error(ExceptionUtil.getMessage(e));
        return R.error().message(e.getMsg()).code(e.getCode());
    }
}
