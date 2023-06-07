package com.example.attendancesystem;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class studentPage extends AppCompatActivity {

    private Button viewAttendanceButton;
    private Button notificationsButton;
    private TextView attendanceShortageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);

        // Initialize views
        viewAttendanceButton = findViewById(R.id.btnViewAttendance);
        notificationsButton = findViewById(R.id.btnNotifications);
        attendanceShortageTextView = findViewById(R.id.tvAttendanceShortage);

        // Set click listener for view attendance button
        viewAttendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle view attendance functionality
                // Add your logic here to navigate to the attendance view page

                // Display a toast message
                Toast.makeText(studentPage.this, "View Attendance Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Set click listener for notifications button
        notificationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle notifications functionality
                // Add your logic here to navigate to the notifications page

                // Display a toast message
                Toast.makeText(studentPage.this, "Notifications Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Set the attendance shortage text
        int attendanceShortage = 5; // Replace with your actual logic to calculate the attendance shortage
        attendanceShortageTextView.setText("Attendance Shortage: " + attendanceShortage + " classes");
    }
}
