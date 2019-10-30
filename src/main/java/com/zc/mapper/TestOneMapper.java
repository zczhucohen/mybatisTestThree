package com.zc.mapper;

import com.zc.model.user.User;
import com.zc.model.user.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhuochen
 * @comment
 * @date 2019/10/30
 */
public interface TestOneMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String code);

    int insertUser(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByLogin(@Param("loginName") String loginName);

    User selectByPrimaryKey(@Param("code")String code,
                            @Param("userArray")Integer[] stopSigns,@Param("roleArray") Integer[] roleStopSigns);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateDynamicByUser(User record);

    int updateByPrimaryKey(User record);
}
