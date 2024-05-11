package com.example.quoteapp;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button generateButton;

       private String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "In the middle of difficulty lies opportunity. - Albert Einstein",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "It does not matter how slowly you go as long as you do not stop. - Confucius"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        generateButton = findViewById(R.id.generateButton);

        showRandomQuote();

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomQuote();
            }
        });
    }

    private void showRandomQuote() {

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        quoteTextView.setText(quotes[index]);
    }
}
