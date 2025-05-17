package com.example.aplikasiraja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class DaftarRajaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRaja;
    private RajaAdapter adapter;
    private List<Raja> daftarRaja;
    private Button buttonKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_raja);

        recyclerViewRaja = findViewById(R.id.recyclerViewRaja);
        recyclerViewRaja.setLayoutManager(new GridLayoutManager(this, 2));

        daftarRaja = new ArrayList<>();
        daftarRaja.add(new Raja("King Baldwin", R.drawable.king_baldwin));
        daftarRaja.add(new Raja("Salahuddin Ayyubi", R.drawable.salahudin_al_ayyubi));
        daftarRaja.add(new Raja("Napoleon Bonaparte", R.drawable.napoleon));
        daftarRaja.add(new Raja("Qin Shi Huang", R.drawable.qin_shi_huang));
        daftarRaja.add(new Raja("King Solomon", R.drawable.king_solomon));
        daftarRaja.add(new Raja("Gajah Mada", R.drawable.gajah_mada));

        adapter = new RajaAdapter(this, daftarRaja);
        recyclerViewRaja.setAdapter(adapter);

        buttonKembali = findViewById(R.id.buttonKembali);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}