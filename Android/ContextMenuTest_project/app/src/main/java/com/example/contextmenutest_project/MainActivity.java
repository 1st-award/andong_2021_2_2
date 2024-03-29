package com.example.contextmenutest_project;

import android.graphics.Color;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기(컨텍스트 메뉴)");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.btn1);
        registerForContextMenu(button1);
        button2 = (Button) findViewById(R.id.btn2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(contextMenu,v,menuInfo);
        MenuInflater mInflater = getMenuInflater();

        if (v == button1) {
            contextMenu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.menu1, contextMenu);
        }
        if (v == button2) {
            mInflater.inflate(R.menu.menu2, contextMenu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button2.setRotation(45);
                return true;
            case R.id.subSize:
                button2.setScaleX(2);
                return true;
        }
        return false;
    }
}