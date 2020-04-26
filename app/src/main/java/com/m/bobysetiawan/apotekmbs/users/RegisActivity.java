package com.m.bobysetiawan.apotekmbs.users;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.m.bobysetiawan.apotekmbs.R;
import com.ornach.nobobutton.NoboButton;

public class RegisActivity extends AppCompatActivity {

    NoboButton btnRegis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        getSupportActionBar().hide();

        btnRegis = (NoboButton) findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegisActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
