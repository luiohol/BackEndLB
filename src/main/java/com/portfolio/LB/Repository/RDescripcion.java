/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Repository;

import com.portfolio.LB.Entity.Descripcion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis
 */
@Repository
public interface RDescripcion extends JpaRepository<Descripcion, Integer>{
    public Optional<Descripcion> findByDescripcion(String descripcion);
    public boolean existsByDescripcion(String descripcion);
    
}
