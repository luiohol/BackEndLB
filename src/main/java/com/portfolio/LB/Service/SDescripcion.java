/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Service;

import com.portfolio.LB.Entity.Descripcion;
import com.portfolio.LB.Repository.RDescripcion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis
 */
@Service
@Transactional
public class SDescripcion {
    @Autowired
    RDescripcion rDescripcion;
    
    public List<Descripcion> list(){
        return rDescripcion.findAll();
    }
    public Optional<Descripcion> getOne(int id){
        return rDescripcion.findById(id);
    }
    public Optional<Descripcion> getByDescripcion(String descripcion){
        return rDescripcion.findByDescripcion(descripcion);
    }
    public void save(Descripcion descripcion){
        rDescripcion.save(descripcion);
    }
    
    public void delete(int id){
        rDescripcion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rDescripcion.existsById(id);
    }
    
    public boolean existsByDescripcion(String descripcion){
        return rDescripcion.existsByDescripcion(descripcion);
    }
}
