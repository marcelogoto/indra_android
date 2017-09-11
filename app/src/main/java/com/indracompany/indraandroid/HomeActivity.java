package com.indracompany.indraandroid;

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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView helloWord = (TextView) findViewById(R.id.helloworld);

        Button ptBtn = (Button) findViewById(R.id.portuguese);
        ptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWord.setText("Olá Mundo!");
            }
        });

        Button esBtn = (Button) findViewById(R.id.spanish);
        esBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWord.setText("¡Hola mundo!");
            }
        });

        Button usBtn = (Button) findViewById(R.id.english);
        usBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWord.setText("Hello World!");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
