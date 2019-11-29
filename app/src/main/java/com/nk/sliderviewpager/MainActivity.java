package com.nk.sliderviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AutoScrollViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.startAutoScroll();
        viewPager.setInterval(3000);
        viewPager.setCycle(true);
        viewPager.setStopScrollWhenTouch(true);

        ImagePagerAdapter adapter = new ImagePagerAdapter(MainActivity.this,getList());
        adapter.setInfiniteLoop(true);
        viewPager.setAdapter(adapter);
    }

    private List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.banner_first);
        list.add(R.drawable.banner_seond);
        list.add(R.drawable.banner_third);
        list.add(R.drawable.banner_fourth);
        return list;
    }
}
