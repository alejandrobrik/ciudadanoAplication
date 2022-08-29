package com.briki.ciudadano.repositories;

import com.briki.ciudadano.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //Metodo para buscar por nombre creado en esta interfaz
    public abstract ArrayList<Usuario> findByNombre(String nombre);
}
