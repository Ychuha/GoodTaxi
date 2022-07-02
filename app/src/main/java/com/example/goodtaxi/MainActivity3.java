package com.example.goodtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popupmenu);

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu1:
                        Toast.makeText(getApplicationContext(),
                                "Вы выбрали PopupMenu 1",
                                Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu2:
                        Toast.makeText(getApplicationContext(),
                                "Вы выбрали PopupMenu 2",
                                Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu3:
                        Toast.makeText(getApplicationContext(),
                                "Вы выбрали PopupMenu 3",
                                Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu popupMenu) {
                Toast.makeText(getApplicationContext(), "onDismiss",
                        Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }
}