package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class DuckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duck);

        //Вешаем обработчик на чекбокс и обрабатываем изменение значения
        CheckBox checkBox = findViewById(R.id.checkbox_beer);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    System.out.println("Checked");
                } else {
                    System.out.println("Un-Checked");
                }
            }
        });
//        checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(((CompoundButton) view).isChecked()) {
//                    System.out.println("Checked");
//                } else {
//                    System.out.println("Un-Checked");
//                }
//            }
//        });
    }

    public void onToggleButtonClick(View view) {
        CharSequence text = "hello, I'm toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        boolean on = ((ToggleButton) view).isChecked();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String spinString = String.valueOf(spinner.getSelectedItem());
        if (on) {
            if (spinString.equals("dark")) {
                toast.show();
            }
        } else {
            System.out.println(spinString);
        }
    }
    public void onCheckboxClick(View view) {
        boolean beerIsChecked = ((CheckBox) findViewById(R.id.checkbox_beer)).isChecked();
        boolean milkIsChecked = ((CheckBox) findViewById(R.id.checkbox_milk)).isChecked();
        //обрабатываем клики на всех чекбоксах (
        switch (view.getId()) {
            case R.id.checkbox_beer:
                if (beerIsChecked) {
                    System.out.println("BEER ON");
                } else {
                    System.out.println("BEER OFF");
                }
                break;
            case R.id.checkbox_milk:
                if (milkIsChecked) {
                    System.out.println("MILK ON");
                } else {
                    System.out.println("MILK OFF");
                }
                break;
        }
    }
    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_dick:
                System.out.println("You choose dick. Excellent!");
                break;
            case R.id.radio_balls:
                System.out.println("You choose balls. Good choice!");
                break;
        }
    }

}