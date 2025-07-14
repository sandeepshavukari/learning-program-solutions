package com.example.jwt.controller;

import com.example.jwt.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<Map<String, String>> authenticate(HttpServletRequest request) {
        String header = request.getHeader("Authorization");

        if (header == null || !header.startsWith("Basic ")) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Missing Basic auth header");
            return ResponseEntity.status(400).body(error);
        }

        try {
            String base64Credentials = header.substring("Basic ".length());
            String creds = new String(Base64.getDecoder().decode(base64Credentials), StandardCharsets.UTF_8);

            if (!creds.contains(":")) {
                Map<String, String> error = new HashMap<>();
                error.put("error", "Malformed credentials");
                return ResponseEntity.status(400).body(error);
            }

            String[] split = creds.split(":", 2);
            String username = split[0];

            String token = jwtUtil.generateToken(username);

            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            Map<String, String> error = new HashMap<>();
            error.put("error", "Internal server error: " + e.getMessage());
            return ResponseEntity.status(500).body(error);
        }
    }


}
