package com.itokami1123.sample.frontend;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice 
public class CustomControllerAdvice {
    @ModelAttribute("jsPath")
    public String jsPath() {
        String tail = String.format("%d",System.currentTimeMillis());
        return "/main.js?"+tail;
    }
    
    @ModelAttribute("commonCssPath")
    public String commonCssPath() {
        String tail = String.format("%d",System.currentTimeMillis());
        return "/css/common.css?"+tail;
    }
}