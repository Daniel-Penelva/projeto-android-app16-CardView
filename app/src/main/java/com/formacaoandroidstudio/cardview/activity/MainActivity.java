package com.formacaoandroidstudio.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.formacaoandroidstudio.cardview.R;
import com.formacaoandroidstudio.cardview.adapter.PostagemAdapter;
import com.formacaoandroidstudio.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Criando o objeto da Classe
   private RecyclerView recyclerPostagem;

   // Criando a lista de itens
   List<Postagem> postagens = new ArrayList<Postagem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturando o id do RecyclerView
        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        /* Definir o Layout para organizar em uma lista unidimensional */
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        /* Definir o Adapter */
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){
        Postagem p;

        p = new Postagem("Daniel Penelva", "Viagem Legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel JM", "Viaje, aproveite nosso desconto!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Luiza", "Paris!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo", "Que foto Linda!", R.drawable.imagem4);
        this.postagens.add(p);
    }
}

/* Anotações:
*
* Em attributes para o componente Button. Para adicionar icone ou imagem a um button, basta
* buscar o atributo 'drawable<posição>'
* */