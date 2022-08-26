/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Controller;

import com.portfolio.LB.Dto.dtoDescripcion;
import com.portfolio.LB.Entity.Descripcion;
import com.portfolio.LB.Security.Controller.Mensaje;
import com.portfolio.LB.Service.SDescripcion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis
 */
@RestController
@RequestMapping("/descripcion")
@CrossOrigin(origins = "http://localhost:4200")
public class CDescripcion {
    @Autowired
    SDescripcion sDescripcion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Descripcion>> list(){
        List<Descripcion> list = sDescripcion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Descripcion> getById(@PathVariable("id")int id){
        if(!sDescripcion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Descripcion descripcion = sDescripcion.getOne(id).get();
        return new ResponseEntity(descripcion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sDescripcion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sDescripcion.delete(id);
        return new ResponseEntity(new Mensaje("eliminada"), HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoDescripcion dtodescripcion){
        
        
        Descripcion descripcion = new Descripcion(
                dtodescripcion.getDescripcion()
        );
        sDescripcion.save(descripcion);
        return new ResponseEntity(new Mensaje("creada"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoDescripcion dtodescripcion){
        if(!sDescripcion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        Descripcion descripcion = sDescripcion.getOne(id).get();
        
        descripcion.setDescripcion(dtodescripcion.getDescripcion());
                
        sDescripcion.save(descripcion);
        
        return new ResponseEntity(new Mensaje("Actualizada"), HttpStatus.OK);
    }
}
