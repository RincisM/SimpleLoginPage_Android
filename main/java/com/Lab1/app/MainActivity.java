package com.Lab1.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleText(View v) {
        EditText t= findViewById(R.id.name);
        String text = t.getText().toString();
        Toast.makeText(this, "Welcome "+text, Toast.LENGTH_LONG).show();
    }
}