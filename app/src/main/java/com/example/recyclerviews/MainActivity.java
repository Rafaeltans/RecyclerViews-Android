package com.example.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKontak;
    private List<Kontak>mData = new ArrayList<>();
    private KontakAdapter kontakAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKontak = findViewById(R.id.rv_kontak);
        rvKontak.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        kontakAdapter = new KontakAdapter(mData);

        rvKontak.setAdapter(kontakAdapter);

        dummyKontak();
    }

    public void dummyKontak(){
        Kontak kontak = new Kontak();
        kontak.setId(0);
        kontak.setImage(R.drawable.account_circle_24);
        kontak.setNama("Ahmad");
        kontak.setAlamat("Plaju");
        mData.add(kontak);

        kontak = new Kontak();
        kontak.setId(1);
        kontak.setImage(R.drawable.account_circle_24);
        kontak.setNama("Bola");
        kontak.setAlamat("Kertapati");
        mData.add(kontak);

        kontak = new Kontak();
        kontak.setId(2);
        kontak.setImage(R.drawable.account_circle_24);
        kontak.setNama("Candu");
        kontak.setAlamat("Bukit");
        mData.add(kontak);

        kontak = new Kontak();
        kontak.setId(3);
        kontak.setImage(R.drawable.account_circle_24);
        kontak.setNama("Dadu");
        kontak.setAlamat("Atmo");
        mData.add(kontak);

        kontak = new Kontak();
        kontak.setId(4);
        kontak.setImage(R.drawable.account_circle_24);
        kontak.setNama("Elemen");
        kontak.setAlamat("Kenten");
        mData.add(kontak);
    }
}