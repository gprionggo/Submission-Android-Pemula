package com.dicoding.gprionggo.transportasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    ImageView gambarTransportasi;
    TextView tv_nama_transportasi, detail_transportasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Transportasi transportasi = getIntent().getParcelableExtra(ITEM_EXTRA);


        gambarTransportasi = findViewById(R.id.gambarTransportasi);
        tv_nama_transportasi = findViewById(R.id.tv_nama_transportasi);
        detail_transportasi = findViewById(R.id.detail_transportasi);

        if (transportasi != null) {
            Glide.with(this)
                    .load(transportasi.getFoto_transportasi())
                    .into(gambarTransportasi);
            tv_nama_transportasi.setText(transportasi.getNama_transportasi());
            detail_transportasi.setText(transportasi.getDetail());

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Transportasi");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
