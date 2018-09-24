package tads.eaj.com.bibliotecarecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Taniro on 18/09/2016 atualizado em 23/09/2018
 */
public class LivroAdapter extends RecyclerView.Adapter {

    List<Livro> listaLivro;
    Context context;
    Livro livroescolhido;

    public LivroAdapter (List<Livro> listaLivro, Context context){
        this.listaLivro = listaLivro;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.livro_item_card, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewholder, final int position) {

        ViewHolder holder = (ViewHolder) viewholder;

        livroescolhido = listaLivro.get(position);

        holder.textViewTitulo.setText(livroescolhido.getTitulo());
        holder.textViewAutor.setText(livroescolhido.getAutor());
        holder.textViewQuantidade.setText(""+livroescolhido.getQuantidade());
        if(livroescolhido.getLido()){
            holder.img.setImageResource(R.drawable.open);
        }else{
            holder.img.setImageResource(R.drawable.flat);
        }

    }

    @Override
    public int getItemCount() {
        return listaLivro.size();
    }
}
