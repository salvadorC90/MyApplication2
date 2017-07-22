package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {

       switch(v.getId()) {
           case R.id.library:
               Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
               startActivity(libraryIntent);
               break;

           case R.id.browse:
               Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
               startActivity(browseIntent);
               break;

           case R.id.radio:
               Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
               startActivity(radioIntent);
               break;

           case R.id.store:
               Intent storeIntent = new Intent(MainActivity.this, PaymentsActivity.class);
               startActivity(storeIntent);
               break;


       }

    }
}
