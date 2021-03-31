package com.example.uberbook.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.uberbook.R;
import com.example.uberbook.utils.Navigation;

public class ReturnBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_book);

        Navigation.init(findViewById(R.id.bmb));
    }
}