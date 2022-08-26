/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Repository;

import com.portfolio.LB.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis
 */
@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos> findByTitulo(String Titulo);
    public boolean existsByTitulo(String Titulo);
    
}
