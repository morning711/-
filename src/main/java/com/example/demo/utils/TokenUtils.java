package com.example.demo.utils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.Date;
public class TokenUtils {
    private static final long EXPIRE_TIME = 60 * 60 * 1000;

    public static String genToken(String account, String password) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        String token;
        token= JWT.create().withAudience(account) // 将 account 保存到 token 里面
                .withExpiresAt(date) //60分钟后token过期
                .sign(Algorithm.HMAC256(password)); // 以 password 作为 token 的密钥
        return token;
    }
}
