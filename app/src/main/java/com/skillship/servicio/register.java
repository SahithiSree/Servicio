package com.skillship.servicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.skillship.servicio.ui.home.HomeFragment;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText name=(EditText)findViewById(R.id.fullName);
        EditText email=(EditText)findViewById(R.id.email);
        EditText mobile=(EditText)findViewById(R.id.mobile);
        EditText password=(EditText)findViewById(R.id.password);
        EditText confirmpassword=(EditText)findViewById(R.id.confirmpassword);

        Spinner city=(Spinner)findViewById(R.id.city);

        Button signup=(Button)findViewById(R.id.signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Signing Up.....",Toast.LENGTH_LONG).show();
                startActivity(new Intent(register.this,login.class));
            }
        });
    }
}
