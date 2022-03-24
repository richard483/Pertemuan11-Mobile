package com.example.pertemuan11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button input_bt;
    Button pindahActivity_bt;
    EditText namaInput_et;
    EditText kelasInput_et;
    EditText absenInput_et;
    SharedPreferences sp;

    View.OnClickListener inputSharedPref = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences.Editor edit = sp.edit();
            edit.putString("Nama", namaInput_et.getText().toString());
            edit.putString("Kelas", kelasInput_et.getText().toString());
            edit.putString("Absen", absenInput_et.getText().toString());
            edit.apply();
        }
    };

    View.OnClickListener toNextActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SharedPrefExample.class);
            startActivity(intent);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_bt = findViewById(R.id.input_bt);
        pindahActivity_bt = findViewById(R.id.pindahActivity_bt);
        namaInput_et = findViewById(R.id.inputNama_et);
        kelasInput_et = findViewById(R.id.inputKelas_et);
        absenInput_et = findViewById(R.id.inputAbsen_et);

        sp = getSharedPreferences("data_diri", MODE_PRIVATE);

        input_bt.setOnClickListener(inputSharedPref);
        pindahActivity_bt.setOnClickListener(toNextActivity);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "ON START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "ON RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "ON PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "ON STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}