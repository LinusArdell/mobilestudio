package com.mdp.if31.mahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNomorPendaftaran,etNama;
    Button btnDaftar;
    String nomorPendaftaran,nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.nama);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama = etNama.getText().toString();

                if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor pendafataran wajib diisi");
                }
                else if (nama.trim().equals("")){
                    etNama.setError("Nama wajib diisi");
                }
                else {
                    Toast.makeText(MainActivity.this, "Selamat" + nama + "anda sudah terdaftar di kampus Universitas Multi Data Palembang", Toast.LENGTH_SHORT).show();
                }


            }

        });


    }
}