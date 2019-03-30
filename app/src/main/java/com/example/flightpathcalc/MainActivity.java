package com.example.flightpathcalc;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout nDrawerLayout;
    private ActionBarDrawerToggle nToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            nDrawerLayout= (DrawerLayout) findViewById(R.id.drawerLayout);
            nToggle=new ActionBarDrawerToggle(this, nDrawerLayout, R.string.open, R.string.close);
            nDrawerLayout.addDrawerListener(nToggle);
            nToggle.syncState();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        catch (Exception ex)
        {
            Log.d("MainActivity --> ", "onCreate: " + ex);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (nToggle.onOptionsItemSelected(item))
        {
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
