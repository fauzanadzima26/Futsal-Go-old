package com.example.fauzan.futsalgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailLapanganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lapangan);

        Button buttonPemilihanJadwal = (Button)findViewById(R.id.buttonPemilihanJadwal);
        buttonPemilihanJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(detailLapanganActivity.this, jadwalActivity.class);
                startActivity(i);
            }
        });

    }
}
