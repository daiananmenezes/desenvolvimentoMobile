package com.daiana.cadastrodecarro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.daiana.cadastrodecarro.controller.CarroDAO;
import com.daiana.cadastrodecarro.model.Carro;

public class DetalhesActivity extends AppCompatActivity {

    TextView tvMarca;
    TextView tvModelo;
    TextView tvAnoFab;
    TextView tvCor;
    TextView tvMotor;
    TextView tvCombustivel;
    TextView tvFIPE;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvMarca = findViewById(R.id.tvMarca);
        tvModelo = findViewById(R.id.tvModelo);
        tvAnoFab = findViewById(R.id.tvAnoFab);
        tvCor = findViewById(R.id.tvCor);
        tvMotor = findViewById(R.id.tvMotor);
        tvCombustivel = findViewById(R.id.tvCombustivel);
        tvFIPE = findViewById(R.id.tvFIPE);

        dao = new CarroDAO();

        Intent intent = getIntent();

        int position = intent.getIntExtra("position", -1);

        if (position == -1){ finish(); }

        Carro carro = dao.getCarro(position);

        tvMarca.setText(carro.getMarca());
        tvModelo.setText(carro.getModelo());
        tvAnoFab.setText(String.valueOf(carro.getAnoFab()));
        tvCor.setText(carro.getCor());
        tvMotor.setText(carro.getMotor());
        tvCombustivel.setText(carro.getCombustivel());
        tvFIPE.setText(String.valueOf(carro.getFipe()));

    }
}