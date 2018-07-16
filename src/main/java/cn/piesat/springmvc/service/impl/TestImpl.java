package cn.piesat.springmvc.service.impl;

import cn.piesat.springmvc.service.ITest;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements ITest {
    @Override
    public String test() {
        return "1";
    }
}
