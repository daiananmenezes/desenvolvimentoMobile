package com.daiana.cadastrodecarro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.daiana.cadastrodecarro.controller.CarroDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ListView lvCarros;
    FloatingActionButton fabNovo;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCarros = findViewById(R.id.lvCarros);
        fabNovo = findViewById(R.id.fabNovo);

        dao = new CarroDAO();

        //ação click
        fabNovo.setOnClickListener(view -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        //A ação de click dos elementos da lista
        lvCarros.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, DetalhesActivity.class);
            intent.putExtra("position", position);
            startActivity(intent);
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        lvCarros.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.getCadastro()
        ));
    }
}