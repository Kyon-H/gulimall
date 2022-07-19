package com.atlxc.gulimall.product.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 集中处理所有异常
 */
@Slf4j
@ControllerAdvice(basePackages = "com/atlxc/gulimall/product/controller")
public class GulimallExecptionControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public void handleVaildException(Exception e){
        log.error("数据错误{},类型{}",e.getMessage(),e.getClass());
    }
}
