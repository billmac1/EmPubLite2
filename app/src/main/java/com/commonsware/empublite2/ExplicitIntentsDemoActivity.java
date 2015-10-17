package com.commonsware.empublite2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.commonsware.empublite2.R;

public class ExplicitIntentsDemoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void showOther(View v) {
        startActivity(new Intent(this, OtherActivity.class));
    }
}