package com.dancorrdev;

public class Maquina {
    public String mensajeArrancar, mensajeParar;

    public String mensajeArrancar(){
        mensajeArrancar = "La maquina inicia operacion ";
        return mensajeArrancar;
    }

    public String mensajeParar(){
        mensajeParar="La maquina se esta deteniendo";
        return mensajeParar;
    }
}
