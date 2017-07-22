package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.paypal.android.sdk.onetouch.core.metadata.ah.I;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView library = (TextView) findViewById(R.id.library);
        library.setOnClickListener(this);

        TextView browse = (TextView) findViewById(R.id.browse);
        browse.setOnClickListener(this);

        TextView radio = (TextView) findViewById(R.id.radio);
        radio.setOnClickListener(this);

        TextView store = (TextView) findViewById(R.id.store);
        store.setOnClickListener(this);
    }

    public void onClick(View v) {

        Class navigation;

        if (v.getId() == R.id.library) {
            navigation = LibraryActivity.class;
        } else if (v.getId() == R.id.browse) {
            navigation = BrowseActivity.class;
        } else if (v.getId() == R.id.radio) {
            navigation = RadioActivity.class;
        } else if (v.getId() == R.id.store) {
            navigation = PaymentsActivity.class;
        } else {
            return;
        }

        Intent newActivity = new Intent(this, navigation);
        startActivity(newActivity);

        switch (v.getId()) {

            case R.id.library:
                navigation = LibraryActivity.class;
                break;

            case R.id.browse:
                navigation = BrowseActivity.class;
                break;

            case R.id.radio:
                navigation = RadioActivity.class;
                break;

            case R.id.store:
                navigation = PaymentsActivity.class;
                break;

        }

    }
}
