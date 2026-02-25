package org.authservice.Services;

import org.authservice.repository.RefreshTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.authservice.repository.UserRepository;
@Service
public class RefreshTokenService {
    @Autowired RefreshTokenRepository refreshTokenRepository;
    @Autowired UserRepository userRepository;
    publ
}
