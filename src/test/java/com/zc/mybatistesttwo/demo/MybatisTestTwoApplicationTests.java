package com.zc.mybatistesttwo.demo;

import com.zc.mapper.TestOneMapper;
import com.zc.model.user.User;
import com.zc.model.user.UserExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisTestTwoApplicationTests {

    @Autowired
    TestOneMapper testOneMapper;

    @Test
    void contextLoads() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo("wzxujiao");
        List<User> users = testOneMapper.selectByExample(userExample);
        System.out.println(users);
    }

}
