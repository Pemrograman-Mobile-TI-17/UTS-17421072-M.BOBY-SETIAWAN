package com.m.bobysetiawan.apotekmbs.users;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.m.bobysetiawan.apotekmbs.R;

public class LoginActivity extends AppCompatActivity {
    Button btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnRegis = (Button) findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, RegisActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
}
