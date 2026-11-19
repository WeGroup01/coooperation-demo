package com.example.dao;

import com.example.entity.User;
import org.junit.Test;

public class UserDaoTest {

    private final UserDao userDao = new UserDao();

    @Test
    public void testAllOperations() {
        System.out.println("========== 开始测试 ==========");

      // 1. 测试新增
        User user = new User();
        user.setUsername("李四");
        userDao.save(user);
        System.out.println("新增成功，用户ID为: " + user.getId());

        // 2. 测试查询
        User dbUser = userDao.findById(user.getId());
        System.out.println("查询成功，用户名为: " + dbUser.getUsername());

        // 3. 测试修改
        dbUser.setUsername("lisi");
        userDao.update(dbUser);
        System.out.println("修改成功，新名字为: " + userDao.findById(dbUser.getId()).getUsername());

        // 4. 测试删除
        userDao.deleteById(dbUser.getId());
        System.out.println("删除成功，再查该ID结果为: " + userDao.findById(dbUser.getId()));

        System.out.println("========== 测试结束 ==========");
    }
}