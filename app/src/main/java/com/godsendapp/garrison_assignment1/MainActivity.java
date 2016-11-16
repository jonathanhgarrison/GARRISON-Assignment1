package com.godsendapp.garrison_assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity  implements View.OnClickListener {
    //Create objects
    private Button buttonLogin;
    private EditText editTextLogin;
    private EditText editTextPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Java Objectsto Widgets in the UI

        buttonLogin = (Button) findViewById(R.id.buttonlogin);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonLogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        //Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();

        if (editTextLogin.getText().toString().equals("User") &
                editTextPassword.getText().toString().equals("1234")) {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }

    }
}
