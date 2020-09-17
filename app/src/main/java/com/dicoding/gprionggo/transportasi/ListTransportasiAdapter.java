package com.dicoding.gprionggo.transportasi;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTransportasiAdapter extends RecyclerView.Adapter<ListTransportasiAdapter.ListViewHolder> {
    private ArrayList<Transportasi> listTransportasi;
    private OnItemClickCallback onItemClickCallback;

    public ListTransportasiAdapter(ArrayList<Transportasi> list) {
        this.listTransportasi = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_transportasi, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Transportasi transportasi = listTransportasi.get(position);

        Glide.with(holder.itemView.getContext())
                .load(transportasi.getFoto_transportasi())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(transportasi.getNama_transportasi());
        holder.tvDetail.setText(transportasi.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(transportasi);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listTransportasi.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.foto_transportasi);
            tvName = itemView.findViewById(R.id.tv_trasportasi);
            tvDetail = itemView.findViewById(R.id.tv_detail_transportasi);

        }
    }
}