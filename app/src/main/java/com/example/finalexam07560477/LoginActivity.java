package com.example.finalexam07560477;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    private Button button;
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
    }
    public void  activity_register(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
