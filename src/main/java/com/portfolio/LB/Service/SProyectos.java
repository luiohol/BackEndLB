/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Service;

import com.portfolio.LB.Entity.Proyectos;
import com.portfolio.LB.Repository.RProyectos;
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
public class SProyectos {
    @Autowired
    RProyectos rProyectos; 
    
    public List<Proyectos> list(){
         return rProyectos.findAll();
     }
    
    public Optional<Proyectos> getOne(int id){
         return rProyectos.findById(id);
     }
     
     public Optional<Proyectos> getByTitulo(String titulo){
         return rProyectos.findByTitulo(titulo);
     }
     
     public void save(Proyectos project){
         rProyectos.save(project);
     }
     
     public void delete(int id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByTitulo(String titulo){
         return rProyectos.existsByTitulo(titulo);
     }
}
