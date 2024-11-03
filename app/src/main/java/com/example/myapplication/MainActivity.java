package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etname, etyear;
    private TextView textView2;
    private String name;
    private int year;
    private String details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.etname);
        etyear = findViewById(R.id.etyear);
        textView2 = findViewById(R.id.textView2);

    }
    public void showDetails(android.view.View view) {
        if (etname.getText().toString().isEmpty() || etyear.getText().toString().isEmpty()) {
            Toast.makeText(this, "please fill in fields quickly....", Toast.LENGTH_SHORT).show();
        } else {
            name = etname.getText().toString();
            year = Integer.parseInt(etyear.getText().toString());
            int age = 2024 - year;
            details = "/b"+"Welcome " + name + ", your age is: " + age;
            textView2.setText(details);
        }
    }

}