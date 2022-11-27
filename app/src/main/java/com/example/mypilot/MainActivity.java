package com.example.mypilot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import  android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODo: write something


    }
//    public void onBtnClk(View view){
//        TextView tx2 = findViewById(R.id.button);
//        EditText tx = findViewById(R.id.editTxtName);
////        tx2.setText("HIIII");
//        tx2.setText(tx.getText().toString());
//    }

    public void onRegisterBtn(View view){
        TextView txtFN = findViewById(R.id.textView1);
        TextView txtLN = findViewById(R.id.textView2);
        TextView txtEM = findViewById(R.id.textView4);

        EditText eTxtFN = findViewById(R.id.editTextTextPersonName2);
        EditText eTxtLN = findViewById(R.id.editTextTextPersonName3);
        EditText eTxtEM = findViewById(R.id.editTextTextPersonName4);

        txtFN.setText("First Name:"+ eTxtFN.getText().toString());
        txtLN.setText("Last Name:"+ eTxtLN.getText().toString());
        txtEM.setText("Email Address:"+ eTxtEM.getText().toString());

    }
}