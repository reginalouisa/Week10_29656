package umn.ac.id.week10_29656;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button tombol1, tombol2, tombol3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol1 = findViewById(R.id.Button1);
        tombol2 = findViewById(R.id.Button2);
        tombol3 = findViewById(R.id.Button3);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MainActivity_a.class));
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity_b.class));
            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity_c.class));
            }
        });
    }
}
