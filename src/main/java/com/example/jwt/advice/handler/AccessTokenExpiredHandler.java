package com.example.jwt.advice.handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccessTokenExpiredHandler {
    public void handle(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.sendRedirect("/exception/access-token-expired");
    }
}
