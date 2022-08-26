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
public class dtoProyectos {
    @NotBlank
    private String titulo;
    @NotBlank
    private String subtitulo;
    private String img;
    private String enlace;

    public dtoProyectos() {
    }

    public dtoProyectos(String titulo, String subtitulo, String img, String enlace) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.img = img;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
    
    
}
