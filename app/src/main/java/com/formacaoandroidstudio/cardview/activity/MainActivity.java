package com.formacaoandroidstudio.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.formacaoandroidstudio.cardview.R;
import com.formacaoandroidstudio.cardview.adapter.PostagemAdapter;

public class MainActivity extends AppCompatActivity {

    // Criando o objeto da Classe
   private RecyclerView recyclerPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturando o id do RecyclerView
        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        /* Definir o Layout para organizar em uma lista unidimensional */
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        /* Definir o Adapter */
        PostagemAdapter adapter = new PostagemAdapter();
        recyclerPostagem.setAdapter(adapter);

    }
}
