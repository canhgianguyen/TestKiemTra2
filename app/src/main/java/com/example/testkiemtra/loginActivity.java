package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControls();
        addEvents();
    }

    private void addControls() {
        txtUsername = this.findViewById(R.id.txtUsername);
        txtPassword = this.findViewById(R.id.txtPassword);
        btnLogin = this.findViewById(R.id.btnLogin);
        btnExit = this.findViewById(R.id.btnExit);
    }

    private void addEvents() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processLogin();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processExit();
            }
        });
    }

    private void processLogin() {
        if(txtUsername.getText().toString().equals("Admin") && txtPassword.getText().toString().equals("admin"))
        {
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }
        this.finish();
    }

    private void processExit() {
        finish();
    }
}
