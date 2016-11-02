package com.gupuru.randomstringgenerator.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gupuru.randomstringgenerator.RandomStringGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView generateText = (TextView) findViewById(R.id.text);
        Button generateBtn = (Button) findViewById(R.id.button_generate);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateText.setText(RandomStringGenerator.get());
            }
        });
    }

}
