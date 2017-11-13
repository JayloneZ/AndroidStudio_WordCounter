package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText input;
    private TextView instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = (Button) findViewById(R.id.button);
        this.input = (EditText) findViewById(R.id.input);
        this.instructions = (TextView) findViewById(R.id.instructions);
    }

    public void onButtonClicked(View button) {
        int numberOfWords = WordCounter.numberOfWords(this.input.getText().toString());
        this.instructions.setText("This sentence has " + String.valueOf(numberOfWords) + " words.");
    }
}
