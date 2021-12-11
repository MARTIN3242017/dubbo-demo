package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.samh.api.service.ProducerService;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:20
 */
@Controller
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @GetMapping(value = "/producer")
    public String one() {
        return producerService.getName();
    }

}
