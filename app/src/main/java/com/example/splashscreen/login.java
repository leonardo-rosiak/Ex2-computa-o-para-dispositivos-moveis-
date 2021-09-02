package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        entrar = (Button) findViewById(R.id.botao_login);

        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                entrarActivity();

            }
        });
    }

    private void entrarActivity() {

        startActivity(new Intent(login.this, home.class));

    }
}