package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.RestrictionEntry;
import android.os.Build;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button buttonPindah;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPindah = findViewById(R.id.btnMove);
        editText = findViewById(R.id.editText);

        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")) {
                    editText.setError("Field ini Tidak Boleh Kosong");
                } else {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity. this);
                builder.setTitle("Praktik View");
                builder.setMessage("Apakah kamu yakin?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String input = editText.getText().toString();
                        Toast.makeText(MainActivity.this, input, Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                        i.putExtra("editText", input);
                        startActivity(i);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.setIcon(R.mipmap.ic_launcher);
                AlertDialog alert = builder.create();
                alert.show();
                }
            }
        });


    }


}