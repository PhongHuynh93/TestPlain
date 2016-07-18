package io.plaidapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dhbk.android.plaidapp.R;

public class SearchActivity extends AppCompatActivity {
    public static final String EXTRA_MENU_LEFT = "EXTRA_MENU_LEFT";
    public static final String EXTRA_MENU_CENTER_X = "EXTRA_MENU_CENTER_X";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);
    }
}
