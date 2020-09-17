package com.dicoding.gprionggo.transportasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTransportasi;
    private ArrayList<Transportasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTransportasi = findViewById(R.id.rvTransportasi);
        rvTransportasi.setHasFixedSize(true);

        list.addAll(TransportasiData.getListData());

        showRecyclerList();

    }

    private void showRecyclerList() {
        rvTransportasi.setLayoutManager(new LinearLayoutManager(this));
        ListTransportasiAdapter listTransportasiAdapter = new ListTransportasiAdapter(list);
        rvTransportasi.setAdapter(listTransportasiAdapter);

        listTransportasiAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Transportasi transportasi) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.ITEM_EXTRA, transportasi);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.akun:
                Toast.makeText(getApplicationContext(),"Buka Profil",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
                break;
        }
        return true;
    }
}