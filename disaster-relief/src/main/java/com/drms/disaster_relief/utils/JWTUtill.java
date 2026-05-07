package com.drms.disaster_relief.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JWTUtill {

    @Value("${drms.jwt.secret}")
    private String SECRET_KEY;

    @Value("${drms.jwt.expirationMs}")
    private int tokenExpirey;
}
