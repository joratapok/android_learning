package com.example.mymessenger;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mymessenger.databinding.ActivityCalculatorBinding;

public class CalculatorActivity extends AppCompatActivity {
    private String value = "0";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        TextView textView = (TextView) findViewById(R.id.calc_value);
        textView.setText(value);
    }
    public void addDigit(View view) {
        if (value == "0") {
            value = "Value";
        }
    }
}