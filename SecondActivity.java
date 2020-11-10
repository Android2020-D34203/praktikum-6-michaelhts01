package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
      TextView tvInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvInput = findViewById(R.id.viewInput);

        tvInput.setText(getIntent().getStringExtra("editText"));
    }
}