package cn.lightina.managebooks.dao;

import cn.lightina.managebooks.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    // TODO: 2018/5/12 修改 ！！！
    //通过username和passwd 验证用户 reader
    User checkUser(@Param("user")User user);

}
