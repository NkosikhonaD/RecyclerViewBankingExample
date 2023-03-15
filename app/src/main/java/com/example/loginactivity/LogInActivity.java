package com.example.loginactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class LogInActivity extends AppCompatActivity {
    Button loginButton;
    EditText userNameEdit;
    EditText passwordEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameEdit  = findViewById(R.id.editTextTextPersonName);
        passwordEdit = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName= userNameEdit.getText().toString();
                String passowrd = passwordEdit.getText().toString();
                if(userName.equals("admin")&& passowrd.equals("admin"))
                {
                    Intent intent = new Intent(LogInActivity.this,BankingActivity.class);
                    intent.putExtra("user",userName);
                    startActivity(intent);
                }
            }
        });
    }
}