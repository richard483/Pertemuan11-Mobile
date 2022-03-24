package com.example.pertemuan11_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new Fragment1())
//                .commit();

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        setUpViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager){
        if (fragmentAdapter == null){
            fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
            fragmentAdapter.addFragment(new Fragment1(), "Fragment 1");
            fragmentAdapter.addFragment(new Fragment2(), "Fragment 2");
            viewPager.setAdapter(fragmentAdapter);
        }
    }
}