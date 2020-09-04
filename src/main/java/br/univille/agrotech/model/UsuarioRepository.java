package br.univille.agrotech.model;

import org.springframework.data.jpa.repository.JpaRepository;
 
import br.univille.agrotech.model.Usuario;
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
    Usuario findByUsuarioAndSenha(String usuario,String senha);
}