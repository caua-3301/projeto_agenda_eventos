package com.makesoftware.agendar.repository;

import com.makesoftware.agendar.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
