package com.daiana.cadastrodecarro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daiana.cadastrodecarro.controller.CarroDAO;
import com.daiana.cadastrodecarro.model.Carro;

public class CadastroActivity extends AppCompatActivity {

    EditText etMarca;
    EditText etModelo;
    EditText etAnoFab;
    EditText etCor;
    EditText etMotor;
    EditText etCombustivel;
    EditText etFIPE;
    Button btnCadastrar;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // referencia elemento do xml
        etMarca = findViewById(R.id.etMarca);
        etModelo = findViewById(R.id.etModelo);
        etAnoFab = findViewById(R.id.etAnoFab);
        etCor = findViewById(R.id.etCor);
        etMotor = findViewById(R.id.etMotor);
        etCombustivel = findViewById(R.id.etCombustivel);
        etFIPE = findViewById(R.id.etFIPE);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        dao = new CarroDAO();

        // diraciona para :
        btnCadastrar.setOnClickListener(v -> {

            //valida se os campos foram preenchidos
            if (etMarca.getText().toString().isEmpty() ||
                    etModelo.getText().toString().isEmpty() ||
                    etAnoFab.getText().toString().isEmpty() ||
                    etCor.getText().toString().isEmpty() ||
                    etMotor.getText().toString().isEmpty() ||
                    etCombustivel.getText().toString().isEmpty() ||
                    etFIPE.getText().toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else {
                float fipF = Float.parseFloat(etFIPE.getText().toString());
                int anoFab = Integer.parseInt(etAnoFab.getText().toString());
                Carro carro = new Carro(
                        etMarca.getText().toString(),
                        etModelo.getText().toString(),
                        anoFab,
                        etCor.getText().toString(),
                        etMotor.getText().toString(),
                        etCombustivel.getText().toString(),
                        fipF

                );

                dao.salvar(carro);

                Toast.makeText(this, "Carro Cadastrado", Toast.LENGTH_SHORT).show();

                finish(); // mata a astivity atual e volta pra anterior


            }
        });

    }
}