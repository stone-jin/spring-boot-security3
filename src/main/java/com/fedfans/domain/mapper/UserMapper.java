package com.fedfans.domain.mapper;

import com.fedfans.domain.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by stone-jin on 2018/4/29.
 */
@Mapper
public interface UserMapper {

    UserPO getUserByName(String name);
}
