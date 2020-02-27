/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.auth.celk.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.auth.celk.entities.User;
import br.com.auth.celk.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author caiba
 */
@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("Called with username {}", username);

        Optional<User> userOptional = repo.findByUsernameIgnoreCase(username);

        userOptional.orElseThrow(() -> new UsernameNotFoundException("No user found with username " + username));
        //TODO retornar uma lista de authorities
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        return new org.springframework.security.core.userdetails.User(userOptional.get().getUsername(),
                userOptional.get().getPassword(),
                grantedAuthorities);


    }

}
