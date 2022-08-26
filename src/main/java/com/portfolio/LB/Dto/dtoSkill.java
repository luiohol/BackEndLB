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
public class dtoSkill {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String porcentajeS;
    private String radioS;
    
    public dtoSkill() {
    }

    public dtoSkill(String nombreS, String porcentajeS, String radioS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
        this.radioS = radioS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

    public String getRadioS() {
        return radioS;
    }

    public void setRadioS(String radioS) {
        this.radioS = radioS;
    }

    
    
}
