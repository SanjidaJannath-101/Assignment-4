package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private List<TechItem> techItems;

    // Constructor
    public CustomListAdapter(Context context, List<TechItem> techItems) {
        this.context = context;
        this.techItems = techItems;
    }

    @Override
    public int getCount() {
        return techItems.size();
    }

    @Override
    public Object getItem(int position) {
        return techItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_custom, parent, false);
        }

        TechItem currentItem = techItems.get(position);


        ImageView icon = convertView.findViewById(R.id.techIcon);
        TextView title = convertView.findViewById(R.id.techTitle);
        TextView description = convertView.findViewById(R.id.techDescription);

        icon.setImageResource(currentItem.getIconResId());
        title.setText(currentItem.getTitle());
        description.setText(currentItem.getDescription());

        return convertView;
    }
}
