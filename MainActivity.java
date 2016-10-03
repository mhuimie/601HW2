package com.example.mhuimie.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button hellobtn = (Button)findViewById(R.id.button);
        hellobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView hellotv = (TextView)findViewById(R.id.button4);
                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();
                hellotv.setText(R.string.interact_message);
            }
        });
    }
}