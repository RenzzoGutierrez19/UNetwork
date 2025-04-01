package com.unidadred.conexionred.controller;

import com.unidadred.conexionred.service.AuthService;

public class AuthController {
    private AuthService auth = new AuthService();

    // Método que maneja la autenticación
    public boolean Authenticate(String username, String password) {
        return auth.Auth(username, password);
    }
}
