package io.github.futurewl.sbs;

import io.github.futurewl.sbs.entity.User;
import io.github.futurewl.sbs.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DataMybatisPlusAppTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
