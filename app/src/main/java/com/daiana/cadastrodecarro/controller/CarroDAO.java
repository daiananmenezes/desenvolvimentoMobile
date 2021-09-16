package com.daiana.cadastrodecarro.controller;

import com.daiana.cadastrodecarro.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private static List<Carro> cadastro = new ArrayList<>();

    public void salvar(Carro carro) {
        cadastro.add(carro);
    }

    public void excluir(int position) {
        cadastro.remove(position);
    }

    public Carro getCarro(int position) {
        return cadastro.get(position);
    }

    public static List<Carro> getCadastro() {
        return cadastro;
    }
}
