package co.edu.sena.proyecto.Controller;

import co.edu.sena.proyecto.Entity.Usuario;
import co.edu.sena.proyecto.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping
    public Usuario obtenerUsuario(){
        long nombre;
        Usuario usuario = new Usuario();
        return usuario;
    }
}
