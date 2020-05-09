package com.skillship.servicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.skillship.servicio.ui.home.HomeFragment;

public class login extends AppCompatActivity {

        EditText ETUserInput, ETUserPassword;
        Button login,signup;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            setContentView(R.layout.activity_main);
            Button login = (Button) findViewById(R.id.logBtn);
            Button clear = (Button) findViewById(R.id.clear);
            Button exit = (Button) findViewById(R.id.exit);
            Button signup = (Button) findViewById(R.id.signup);
            final EditText username = (EditText) findViewById(R.id.username);
            final EditText password = (EditText) findViewById(R.id.password);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    startActivity(new Intent(login.this, HomeFragment.class));


                }
            });


            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    username.setText("");
                    password.setText("");

                }
            });

            exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    finish();
                }
            });
            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(login.this,register.class));
                    finish();
                }
            });


        }
}
