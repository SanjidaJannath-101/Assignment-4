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
        groupList.add("Cloud Computing");
        groupList.add("Cybersecurity");
        groupList.add("Quantum Computing");

        childMap.put("Artificial Intelligence", Arrays.asList(
                "AI refers to the simulation of human intelligence in machines.",
                "Applications include self-driving cars, chatbots, and virtual assistants.",
                "Subfields: Machine Learning, Natural Language Processing, Computer Vision."
        ));

        childMap.put("Blockchain Technology", Arrays.asList(
                "A decentralized ledger ensuring transparency and security.",
                "Applications include cryptocurrencies, supply chain management, and smart contracts.",
                "Key features: Immutability, decentralization, and security."
        ));

        childMap.put("Cloud Computing", Arrays.asList(
                "On-demand delivery of IT resources over the internet.",
                "Types: Public, Private, and Hybrid clouds.",
                "Benefits: Scalability, cost-effectiveness, and flexibility.",
                "Popular services: Amazon AWS, Google Cloud, Microsoft Azure."
        ));

        childMap.put("Cybersecurity", Arrays.asList(
                "Protecting systems, networks, and data from cyberattacks.",
                "Techniques include firewalls, encryption, and multi-factor authentication.",
                "Emerging threats: Ransomware, phishing, and zero-day vulnerabilities.",
                "Critical for businesses to maintain trust and prevent financial loss."
        ));

        childMap.put("Quantum Computing", Arrays.asList(
                "Utilizes quantum mechanics to solve problems beyond classical computers.",
                "Key principles: Superposition, entanglement, and quantum gates.",
                "Applications: Cryptography, drug discovery, and optimization problems.",
                "Major players: IBM, Google, and D-Wave."
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
