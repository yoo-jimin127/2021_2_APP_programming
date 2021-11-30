package com.example.assignment5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private EditText edit1;
    private ImageView img1;
    private RelativeLayout baseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseLayout = (RelativeLayout) findViewById(R.id.baseLayout);
        edit1 = (EditText) findViewById(R.id.edit1);
        img1 = (ImageView) findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.rotation:
                String rot = edit1.getText().toString();
                img1.setRotation(Integer.parseInt(rot));
                edit1.setText(null);
                return true;
            case R.id.item1:
                img1.setImageResource(R.drawable.halla);
                return true;
            case R.id.item2:
                img1.setImageResource(R.drawable.baekdu);
                return true;
            case R.id.item3:
                img1.setImageResource(R.drawable.sulak);
                return true;
        }
        return false;
    }
}