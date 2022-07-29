package com.example.recyclerviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ViewHolder> {

    private List<Kontak> mData;

    public KontakAdapter(List<Kontak> mData) {

        this.mData = mData;
    }

    public void addNewsData(List<Kontak> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNama, tvAlamat;
        public ImageView ivKontak;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivKontak = itemView.findViewById(R.id.iv_kontak);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
        }

        public void bind(Kontak item) {
            ivKontak.setImageResource(item.getImage());
            tvNama.setText(item.getNama());
            tvAlamat.setText(item.getAlamat());
        }
    }
}