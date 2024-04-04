package com.example.fifApi.services;

import com.example.fifApi.models.UsuarioModel;
import com.example.fifApi.repositories.UsuarioRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return(ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
}
