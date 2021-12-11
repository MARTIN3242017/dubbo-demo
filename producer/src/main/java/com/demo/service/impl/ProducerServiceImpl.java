package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import com.samh.api.service.ProducerService;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:21
 */
@Component
@Service(version = "1.0.0")
public class ProducerServiceImpl implements ProducerService {
    @Override
    public String getName() {
        return "Producer-wankai";
    }
}