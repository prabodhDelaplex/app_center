package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        final TextView message = (TextView) findViewById(R.id.message);

        final TextView edFirtstname = (TextView) findViewById(R.id.edFirtstname);
        final TextView edLasttname = (TextView) findViewById(R.id.edLasttname);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = edFirtstname.getText().toString();
                String last = edLasttname.getText().toString();
                message.setText("welcome, " +first +" "+last);
            }
        });
    }

}
