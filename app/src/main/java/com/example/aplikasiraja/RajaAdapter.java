package com.example.aplikasiraja;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RajaAdapter extends RecyclerView.Adapter<RajaAdapter.RajaViewHolder> {

    private Context context;
    private List<Raja> daftarRaja;

    public RajaAdapter(Context context, List<Raja> daftarRaja) {
        this.context = context;
        this.daftarRaja = daftarRaja;
    }

    @NonNull
    @Override
    public RajaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_raja, parent, false);
        return new RajaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RajaViewHolder holder, int position) {
        Raja raja = daftarRaja.get(position);
        holder.textViewNamaRaja.setText(raja.getNama());
        holder.imageViewRaja.setImageResource(raja.getFotoResId());

        holder.buttonLihatProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke DetailRajaActivity
                Intent intent = new Intent(context, DetailRajaActivity.class);
                // Kirim data raja yang dipilih
                intent.putExtra("nama", raja.getNama());
                intent.putExtra("fotoResId", raja.getFotoResId());
                // Tambahkan data lain yang ingin Anda tampilkan
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return daftarRaja.size();
    }

    public static class RajaViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewRaja;
        public TextView textViewNamaRaja;
        public Button buttonLihatProfil;

        public RajaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewRaja = itemView.findViewById(R.id.imageViewRaja);
            textViewNamaRaja = itemView.findViewById(R.id.textViewNamaRaja);
            buttonLihatProfil = itemView.findViewById(R.id.buttonLihatProfil);
        }
    }
}
