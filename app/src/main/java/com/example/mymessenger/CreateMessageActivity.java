package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view) {
        EditText input = findViewById(R.id.message);
        String message = input.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, message);
//        String chooserTitle = getString(R.string.chooser_send);
//        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
//        startActivity(chosenIntent);
    }
    public void onCalculator(View view) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }
    public void showDuck(View view) {
        Intent intent = new Intent(this, DuckActivity.class);
        startActivity(intent);
    }
}