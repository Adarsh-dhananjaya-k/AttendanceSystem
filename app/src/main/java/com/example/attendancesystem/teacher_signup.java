package com.example.attendancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class teacher_signup extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText specialKeyEditText;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_signup2);

        // Initialize views
        usernameEditText = findViewById(R.id.txt_TaecherSignupUn);
        passwordEditText = findViewById(R.id.txt_TeacherSignupPass);
        specialKeyEditText = findViewById(R.id.txt_TaecherSignupUn2);
        signupButton = findViewById(R.id.btn_signup);

        // Set click listener for signup button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered data
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String specialKey = specialKeyEditText.getText().toString();

                // Check if special key matches
                if (specialKey.equals("12345678")) {
                    // Create a Bundle to store the data
                    Bundle dataBundle = new Bundle();
                    dataBundle.putString("username", username);
                    dataBundle.putString("password", password);

                    // Display a toast message with the entered data
                    String message = "Username: " + username + "\nPassword: " + password;
                    Toast.makeText(teacher_signup.this, message, Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(teacher_signup.this,MainActivity.class);
                    startActivity(intent);
                } else {
                    // Display an error toast message
                    Toast.makeText(teacher_signup.this, "Incorrect special key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
