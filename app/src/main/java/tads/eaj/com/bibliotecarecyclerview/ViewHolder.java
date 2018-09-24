package tads.eaj.com.bibliotecarecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Taniro on 18/09/2016 atualizado em 23/09/2018
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;

    public ViewHolder(View v) {
        super(v);

        textViewTitulo =  v.findViewById(R.id.titulo);
        textViewAutor=  v.findViewById(R.id.autor);
        textViewQuantidade= v.findViewById(R.id.quantidade);
        img =  v.findViewById(R.id.img);
    }

}
