package com.github.leaguelugas.formingi.security;

import kr.hs.dsm_scarfs.shank.entites.user.UserFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthDetailsService implements UserDetailsService {

    private final UserFactory userFactory;

    @Override
    public kr.hs.dsm_scarfs.shank.security.auth.AuthDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return userFactory.getAuthDetails(userEmail);
    }

}
