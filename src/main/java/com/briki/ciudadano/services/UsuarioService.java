package com.briki.ciudadano.services;

import com.briki.ciudadano.models.Usuario;
import com.briki.ciudadano.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>)usuarioRepository.findAll();
    }
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerPorId(int id){
        return usuarioRepository.findById(id);
    }
    public ArrayList<Usuario> obtenerPorNombre(String nombe){
        return usuarioRepository.findByNombre(nombe);
    }

    public boolean elimanrUsuario(int id) {
        try {
            usuarioRepository.deleteById(id);
            return true;

        } catch (Exception err) {
            return false;
        }
    }
}
