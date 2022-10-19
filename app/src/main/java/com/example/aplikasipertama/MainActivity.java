package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCall = findViewById(R.id.btn_telepon);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085727564002"));
                startActivity(intent);
            }
        });
    }

    public void alamat(View view){
        String url="https://www.google.com/maps/place/Perumahan+Janegara+Brebes/@-6.9538874,109.0433014,17.09z/data=!4m8!1m2!2m1!1sperum+janegara+blok+e%3D7+kecamatn+jatibarang!3m4!1s0x2e6fbb2b8cc55343:0x19428fc6a66be7b2!8m2!3d-6.9532566!4d109.0468841";
        Intent bukaAlamat= new Intent(Intent.ACTION_VIEW);
        bukaAlamat.setData(Uri.parse(url));
        startActivity(bukaAlamat);
    }
    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:shaka99rz@gmail.com"));
        startActivity(Intent.createChooser(intent,"Chooser Title"));
    }
}