package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnClick(View view){

        EditText edtTxtFName= findViewById(R.id.txtFirstName);

        EditText edtTxtLName= findViewById(R.id.txtLastName);

        EditText edtTxtEmail= findViewById(R.id.txtEmail);

        TextView getFirstName= findViewById(R.id.textView);
        TextView getLastName= findViewById(R.id.textView2);
        TextView getEmail= findViewById(R.id.textView3);
        getFirstName.setText( edtTxtFName.getText().toString());
        getLastName.setText( edtTxtLName.getText().toString());
        getEmail.setText( edtTxtEmail.getText().toString());
    }
}