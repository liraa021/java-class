package com.rodrigolira.meu_primeiro_projeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControllerAPI {

    @GetMapping("/help")
    public Map<String, Object> getHelpInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("app_name", "meu-primeiro-projeto");
        response.put("version", "1.0.0");
        response.put("environment", "AWS EC2 - Ubuntu");
        response.put("description", "API Spring Boot integrada com sucesso na infraestrutura Cloud.");
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> getHealth() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        return response;
    }
}