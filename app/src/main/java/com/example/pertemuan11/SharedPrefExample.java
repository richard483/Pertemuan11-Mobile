package com.example.pertemuan11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SharedPrefExample extends AppCompatActivity {

    Button goBack_bt;
    TextView nameOutput_tv;
    TextView absenOutput_tv;
    TextView kelasOutout_tv;
    SharedPreferences sp;

    View.OnClickListener goBack = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref_example);

        goBack_bt = findViewById(R.id.back_bt);
        nameOutput_tv = findViewById(R.id.outputNama_tv);
        absenOutput_tv = findViewById(R.id.outputAbsen_tv);
        kelasOutout_tv = findViewById(R.id.outputKelas_tv);

        sp = getSharedPreferences("data_diri", MODE_PRIVATE);

        String nama = sp.getString("Nama", "Null");
        String kelas = sp.getString("Kelas", "Null");
        String absen = sp.getString("Absen", "Null");

        nameOutput_tv.setText("Name: " + nama);
        absenOutput_tv.setText("Absen: " + absen);
        kelasOutout_tv.setText("Kelas: " + kelas);

        goBack_bt.setOnClickListener(goBack);

    }
}