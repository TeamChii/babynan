package com.example.finalexam07560477;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button button;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1 = (EditText) findViewById(R.id.full_name_edit_text);
        e2 = (EditText) findViewById(R.id.username_edit_text);
        e3 = (EditText) findViewById(R.id.password_edit_text);

        button = (Button) findViewById(R.id.register_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s1 = e1.getText().toString();
                        activity_register();
            }
        });
    }
    public void  activity_register(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

        Toast t = Toast.makeText(this,"Register successfully",Toast.LENGTH_LONG);
        t.show();
    }
}