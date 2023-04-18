package com.formacaoandroidstudio.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.formacaoandroidstudio.cardview.R;
import com.formacaoandroidstudio.cardview.model.Postagem;

import java.util.List;

/* Adapter e o ViewHolder. Essas duas classes trabalham juntas para definir como seus dados são exibidos.*/

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    /* Para implementar os métodos - clica com o botão direito do mouse em 'generate' e 'implements methods' */

    private List<Postagem> listaPostagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.listaPostagens = postagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = listaPostagens.get(position);

        // Usando o holder para setar os valores do componentes
        holder.nome.setText(postagem.getNome());
        holder.postagem.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return listaPostagens.size();
    }

    /* Os dados que serão ecxibidos */
    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public MyViewHolder(View itemView) {
            super(itemView);

            //capturar os ids dos componentes-  usa-se o mesmo itemView.
            nome = itemView.findViewById(R.id.textNome);
            postagem = itemView.findViewById(R.id.textPostagem);
            imagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
