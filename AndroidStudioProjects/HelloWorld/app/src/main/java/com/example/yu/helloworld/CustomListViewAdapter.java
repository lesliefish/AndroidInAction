package com.example.yu.helloworld;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<String> {

    private final Activity activity;

    public String[] getTitles() {
        return titles;
    }

    public String[] getSubTitles() {
        return subTitles;
    }

    public Integer[] getImageIds() {
        return imageIds;
    }

    private final String[] titles;

    public Activity getActivity() {
        return activity;
    }

    private final String[] subTitles;
    private final Integer[] imageIds;

    public CustomListViewAdapter(Activity activity, String[] titles, String[] subTitles, Integer[] imageIds) {
        super(activity, R.layout.activity_custom_list_view, titles);

        this.activity = activity;
        this.titles = titles;
        this.subTitles = subTitles;
        this.imageIds = imageIds;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.activity_custom_list_view, null, true);

        TextView titleTextView = rowView.findViewById(R.id.item_title);
        ImageView iconImageView = rowView.findViewById(R.id.item_icon);
        TextView subtitleTextView = rowView.findViewById(R.id.item_subtitle);

        titleTextView.setText(titles[position]);
        iconImageView.setImageResource(imageIds[position]);
        subtitleTextView.setText(subTitles[position]);

        return rowView;
    }

}
