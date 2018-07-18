package cn.piesat.springmvc.service.impl;

import cn.piesat.springmvc.dao.TUserMapper;
import cn.piesat.springmvc.entity.TUser;
import cn.piesat.springmvc.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements ITest {

    @Autowired
    private TUserMapper tum;

    @Override
    public TUser test(Integer id) {
        TUser tUser = tum.selectByPrimaryKey(id);
        return tUser;
    }
}
