package com.example.apurva.mar26;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button submit;
    EditText name;
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        details=findViewById(R.id.details);

        //initialiaze dialog
        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog_layout);
        dialog.setCancelable(false);
        dialog.show();

        submit=dialog.findViewById(R.id.btn_submit);
        name=dialog.findViewById(R.id.enter_name);




             submit.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     if (name.getText().toString().isEmpty()){
                         name.setError("Please enter your name");
                     }
                     else if (name.getText().toString().length()<3){
                         Toast.makeText(MainActivity.this, "Name length should be more than 2", Toast.LENGTH_SHORT).show();
                     }

                     else{

                         details.setText("Welcome to Ducat \n"+name.getText().toString().toUpperCase());
                         dialog.dismiss();
                     }


                 }
             });




    }
}
