package br.com.statement.service;

import br.com.statement.entity.Usuarios;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UsuariosService {
    public Usuarios findByEmail(String email) {
        return Usuarios.find("email", email).firstResult();
    }

    @Transactional
    public void insertUsuario(Usuarios usuario) {
        usuario.persistAndFlush();
    }
}
