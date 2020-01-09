package com.example.gameworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static ListView menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuList = (ListView) findViewById(R.id.listView);

        String[] items = { getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help) };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Toast toast;
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if(strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))){
                    textView.setBackgroundColor(getResources().getColor(R.color.menu_color));

                    toast = Toast.makeText(getApplicationContext(),
                            "You are press, menu_item_play", Toast.LENGTH_SHORT);

                    toast.show();
                }else if(strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))){
                    textView.setBackgroundColor(getResources().getColor(R.color.menu_color));
                    toast = Toast.makeText(getApplicationContext(),
                            "You are press, menu_item_settings", Toast.LENGTH_SHORT);

                    toast.show();
                }else if(strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))){
                    textView.setBackgroundColor(getResources().getColor(R.color.menu_color));
                    toast = Toast.makeText(getApplicationContext(),
                            "You are press, menu_item_scores", Toast.LENGTH_SHORT);

                    toast.show();
                }else if(strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))){
                    textView.setBackgroundColor(getResources().getColor(R.color.menu_color));
                    toast = Toast.makeText(getApplicationContext(),
                            "You are press, menu_item_help", Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });

    }

}
