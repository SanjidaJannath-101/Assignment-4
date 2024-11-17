package com.example.assignment_4;

public class TechItem {
    private int iconResId;
    private String title;
    private String description;

    // Constructor
    public TechItem(int iconResId, String title, String description) {
        this.iconResId = iconResId;
        this.title = title;
        this.description = description;
    }

    public int getIconResId() {
        return iconResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
