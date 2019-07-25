package com.aaa.power.service.impl;

import com.aaa.power.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.service.impl
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/23 21:33
 * @Version: 1.0
 */
@Service
public class PowerListImpl implements PowerService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Map> getPowerList() {
        return restTemplate.getForObject("http://manager/powerList",List.class);
    }
}
