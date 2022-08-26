/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.LB.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Luis
 */
public class dtoDescripcion {
    @NotBlank
    private String descripcion;

    public dtoDescripcion() {
    }

    public dtoDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
