package com.example.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ExpandableListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        Button backButton = findViewById(R.id.backToMainButton);

        List<String> groupList = new ArrayList<>();
        HashMap<String, List<String>> childMap = new HashMap<>();

        groupList.add("Artificial Intelligence");
        groupList.add("Blockchain Technology");

        childMap.put("Artificial Intelligence", Arrays.asList(
                "AI refers to the simulation of human intelligence in machines."
        ));
        childMap.put("Blockchain Technology", Arrays.asList(
                "A decentralized ledger that ensures transparency and security."
        ));

        ExpandableListAdapter adapter = new ExpandableListAdapter(this, groupList, childMap);
        expandableListView.setAdapter(adapter);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ExpandableListViewActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
