package com.example.attendancesystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class teacher_login extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button forgotPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        // Initialize views
        usernameEditText = findViewById(R.id.txt_TeacherLoginUname);
        passwordEditText = findViewById(R.id.txt_TeacherLoginPass);
        loginButton = findViewById(R.id.btn_login);
        forgotPasswordButton = findViewById(R.id.btn_login2);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered username and password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                // Perform login authentication
                // Add your logic here to check the credentials

                // Display a toast message with the login status
                String message = "Login Successful!\nUsername: " + username + "\nPassword: " + password;
                Toast.makeText(teacher_login.this, message, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(teacher_login.this, mainTeacherPage.class);
                startActivity(intent);
            }
        });

        // Set click listener for forgot password button
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the forgot password functionality
                // Add your logic here to implement the forgot password flow

                // Display a toast message
                Intent intent = new Intent(teacher_login.this, forgot.class);
                startActivity(intent);
                Toast.makeText(teacher_login.this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
