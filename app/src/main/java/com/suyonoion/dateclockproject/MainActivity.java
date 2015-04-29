package com.suyonoion.dateclockproject;
/*
 * Copyright (c) 2015 by Suyono (ion).
 * All rights reserved.
 *
 * This product is protected by copyright and distributed under
 * licenses restricting copying, distribution and decompilation.
 */
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.notif,
                (ViewGroup) findViewById(R.id.relativeLayout1));

        Toast toast = new Toast(this);
        toast.setView(view);
        toast.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item)


    {
        switch( item.getItemId() )
        {
            case R.id.about:
                Intent intent = new Intent(this, about.class);
                startActivity(intent);
                return true;
            case R.id.github:
                goTogithub ( "https://github.com/suyonoion/DateClockProject");
                return true;

            case R.id.smali:
                goTosmali ( "https://www.dropbox.com");
                return true;

        }

        return false;
    }
    private void goTogithub (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    private void goTosmali (String urldownload) {
        Uri uriUrldownload = Uri.parse(urldownload);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrldownload);
        startActivity(launchBrowser);
    }
}
