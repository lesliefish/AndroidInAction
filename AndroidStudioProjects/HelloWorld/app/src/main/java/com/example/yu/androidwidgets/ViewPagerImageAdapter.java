package com.example.yu.androidwidgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yu.helloworld.R;

public class ViewPagerImageAdapter extends PagerAdapter {
    private Context context;
    private int[] imagesId = new int[]{
            R.drawable.logo_android, R.drawable.logo_circle, R.drawable.logo_linkedin,
            R.drawable.logo_twitter, R.drawable.logo_youtube
    };

    ViewPagerImageAdapter(Context c){
        this.context = c;
    }

    @Override
    public int getCount() {
        return imagesId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((ImageView)o);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(imagesId[position]);
        ((ViewPager) container).addView(imageView, 0);

        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

}
