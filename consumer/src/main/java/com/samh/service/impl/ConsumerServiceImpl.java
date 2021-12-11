package com.samh.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.samh.api.service.ConsumerService;
import com.samh.api.service.ProducerService;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:21
 */
@Component
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(version = "1.0.0")
    private ProducerService producerService;

    @Scheduled(cron = "0/20 * * * * ?")
    @Override
    public String getName() {
        if (producerService == null) {
            System.out.println("producerService 为null");
        } else {
            System.out.println("成功消费到生产者的数据:" + producerService.getName());
        }
        return "Consumer-wankai";
    }
}



