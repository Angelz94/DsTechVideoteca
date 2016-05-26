package org.dstech.videoteca.service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.dstech.videoteca.dao.UserDao;
import org.dstech.videoteca.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
 
    @Autowired
    private UserDao userService;
     
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
    	System.out.println("loadUserByUsername");
        User user = userService.findBySso(ssoId);
        System.out.println("Dopo query - User : "+user);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        
        return new org.springframework.security.core.userdetails.User(user.getUser(), user.getPass(), getRuolo(user));
    }
 
    private List<GrantedAuthority> getRuolo(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRuolo()));
        return authorities;
    }

}