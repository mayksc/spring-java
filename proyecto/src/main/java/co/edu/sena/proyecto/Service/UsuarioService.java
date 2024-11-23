package co.edu.sena.proyecto.Service;


import co.edu.sena.proyecto.Entity.Usuario;
import co.edu.sena.proyecto.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

   public Usuario guardarUsuario(Usuario usuario){
     return (Usuario) usuarioRepository.save(usuario);
  }




}
