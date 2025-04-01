package com.unidadred.conexionred.service;

import java.util.ArrayList;
import java.util.List;

import com.unidadred.conexionred.model.user;

public class AuthService {
    // Lista de usuarios simulada (Puedes conectarlo a una base de datos)
    private List<user> users = new ArrayList<>();

    public AuthService() {
        // Agregar usuarios de ejemplos con contraseña "EN TEXTO CLARO"
        users.add(new user("hubert", "hubert$2024", "administrador"));
    }

    public boolean Auth(String username, String password) {
        for (user userName : users) {
            if (userName.getuserName().equals(username) && userName.getpassWord().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
