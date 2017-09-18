package tads.eaj.com.bibliotecarecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Taniro on 18/09/2016.
 */
public class ViewHolder extends RecyclerView.ViewHolder /*implements View.OnClickListener*/{

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;

    public ViewHolder(View v) {
        super(v);

        textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        textViewAutor= (TextView) v.findViewById(R.id.autor);
        textViewQuantidade= (TextView) v.findViewById(R.id.quantidade);
        img = (ImageView) v.findViewById(R.id.img);
        //v.setOnClickListener(this);
    }

    /*
    @Override
    public void onClick(View view) {
        Log.i("click", getAdapterPosition()+"" );
    }
    */
}
