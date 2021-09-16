package com.daiana.cadastrodecarro.model;

import com.daiana.cadastrodecarro.R;

public class Carro {

    private String marca ;
    private String modelo;
    private int anoFab;
    private String cor;
    private String motor;
    private String combustivel;
    private float fipe;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFab, String cor, String motor, String combustivel, float fipe) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.cor = cor;
        this.motor = motor;
        this.combustivel = combustivel;
        this.fipe = fipe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getFipe() {
        return fipe;
    }

    public void setFipe(float fipe) {
        this.fipe = fipe;
    }

    public String toString(){
        return this.marca + " " + this.modelo ;
    }
}
