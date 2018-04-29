package com.fedfans.services;

import com.fedfans.domain.UserPO;
import com.fedfans.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by stone-jin on 2018/4/28.
 */
@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("[loadUserByUsername] s: {}", s);
        UserPO userPO = userMapper.getUserByName(s);
        if(Objects.equals(userPO, null)){
            throw new UsernameNotFoundException("");
        }else{
            log.info("userPO={}", userPO);
            return userPO;
        }
    }
}
