package com.thuandev.Thuan.Ecommerce.security;

import com.thuandev.Thuan.Ecommerce.entity.User;
import com.thuandev.Thuan.Ecommerce.exception.NotFoundException;
import com.thuandev.Thuan.Ecommerce.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("User/ Email Not found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
