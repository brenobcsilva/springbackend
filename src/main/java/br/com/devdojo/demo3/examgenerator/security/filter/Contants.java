package br.com.devdojo.demo3.examgenerator.security.filter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.concurrent.TimeUnit;

public class Contants {
    public static final String SECRET = "secre";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 5000L;

    public static void main(String[] args) {
        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
        System.out.println(new BCryptPasswordEncoder().encode("devdojo"));
    }
}
