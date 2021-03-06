package org.springboot.springmvc.mybatis.security.impl;

import org.springboot.springmvc.mybatis.security.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService
 * 
 * @author wu_firefox@163.com
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    @Autowired
    private BCryptPasswordEncoder encoder;
    
    /**
     * <模拟数据库操作业务>
     */
    @Override
    public UserDetails loadUserByUsername(String s)
        throws UsernameNotFoundException
    {
        String password = "12345";
        User user = new User();
        user.setUsername("admin");
        user.setPassword(encoder.encode(password));
        return new UserDetailsImpl(user);
    }
    
}
