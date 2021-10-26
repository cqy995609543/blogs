package com.blogs.blog;

import com.blogs.entity.User;
import com.blogs.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BlogsApplicationTests {
    //j2ee注解
    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }



    @Test
    void testSelect() {

        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::print);
    }


}
