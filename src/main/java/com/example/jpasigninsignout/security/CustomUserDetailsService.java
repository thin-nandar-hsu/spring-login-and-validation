package com.example.jpasigninsignout.security;

import com.example.jpasigninsignout.dao.UserDao;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {    // this *username must be column name
        return userDao.findUserByUserName(username)
                .map(SecurityUser::new)  //( u-> new SecurityUsr(u))
                .orElseThrow(EntityNotFoundException::new);
    }
}
