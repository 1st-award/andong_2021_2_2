package com.example.tabhosttest_project;

import android.app.Activity;
import android.app.TabActivity;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말");
        tabSpecHorse.setContent(R.id.horse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}