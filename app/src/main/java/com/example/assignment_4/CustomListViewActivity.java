package com.example.assignment_4;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView customListView = findViewById(R.id.customListView);

        List<TechItem> techItems = new ArrayList<>();
        techItems.add(new TechItem(R.drawable.ic_ai, "Artificial Intelligence", "AI simulates human intelligence in machines."));
        techItems.add(new TechItem(R.drawable.ic_blockchain, "Blockchain Technology", "A secure and decentralized ledger."));
        techItems.add(new TechItem(R.drawable.ic_cloud, "Cloud Computing", "On-demand availability of computing resources."));
        techItems.add(new TechItem(R.drawable.ic_cybersecurity, "Cybersecurity", "Protecting systems from digital attacks."));
        techItems.add(new TechItem(R.drawable.ic_quantum, "Quantum Computing", "Computing based on quantum-mechanical phenomena."));

        CustomListAdapter adapter = new CustomListAdapter(this, techItems);
        customListView.setAdapter(adapter);
    }
}
