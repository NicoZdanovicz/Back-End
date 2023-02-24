package com.portfoliozdanovicz.nz.Dto;

import javax.validation.constraints.NotBlank;



public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String img;

    
    //Constructor
    
    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
    }
    
    //Getter y Setters

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
        public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
