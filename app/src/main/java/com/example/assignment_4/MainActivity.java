package com.example.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.customListViewButton).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CustomListViewActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.expandableListViewButton).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExpandableListViewActivity.class);
            startActivity(intent);
        });
    }
}
