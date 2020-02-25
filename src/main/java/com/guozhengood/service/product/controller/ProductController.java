package com.guozhengood.service.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: swf
 * @Description:
 * @Date:Create：in 2020/2/19:22:31
 * @Modified By：
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s, i am from port : %s", message, port);
    }

}
