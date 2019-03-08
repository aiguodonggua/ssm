package com.aaa.ssm.service;

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceImpl
 * description:
 * author:zz
 * createTime:2019/3/2 16:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Map> getUserList() {
        System.out.println("biangeg ");
        System.out.println("biangeg1 ");
        System.out.println("biangeg2");
        System.out.println("biangeg2");
        System.out.println("biangeg2");
        System.out.println("biangeg2");
        System.out.println("第二次");
        System.out.println("第二次蔡哥2");
        System.out.println("caige2冲突提交哦啊111");
        System.out.println("dvr提交111");
        System.out.println("lkfjaewoijfoiasdji");
        return userDao.getUserList();
    }
}
