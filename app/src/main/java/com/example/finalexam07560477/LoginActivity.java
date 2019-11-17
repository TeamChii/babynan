package com.example.finalexam07560477;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {
    private Button button;
    private Button loginBtn;
    private ArrayList db = new DB().getUserList() ;
    EditText userName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.register_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                activity_register();
            }
        });
        loginBtn = (Button) findViewById(R.id.login_button);

        userName =  (EditText) findViewById(R.id.username_edit_text);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onSubmit();
            }
        });


    }
    public void  activity_register(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    private void onSubmit(){
        if( getIntent().getExtras() != null)
        {
            //do here
            db.add(getIntent().getExtras());
        }
        if(!db.isEmpty()){
           for (int i = 0 ; i < db.size() ; i++){
            if(userName.getText().toString().equals("user01")){
                Toast t = Toast.makeText(this,"Login successfully",Toast.LENGTH_LONG);
                t.show();
            }
           }

        }


    }
}
