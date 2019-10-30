package com.zc.service;

import com.zc.mapper.TestOneMapper;
import com.zc.model.user.User;
import com.zc.model.user.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhuochen
 * @comment
 * @date 2019/10/30
 */
@Service
@Transactional()
public class UserService {

    @Autowired
    TestOneMapper testOneMapper;

    @Transactional(readOnly = true)
    public List<User> getUser(String code){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(code);
        return testOneMapper.selectByExample(userExample);

    }


}
