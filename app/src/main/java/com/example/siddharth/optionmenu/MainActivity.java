package com.example.siddharth.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.me:
                Toast.makeText(this,"Settings",Toast.LENGTH_LONG).show();
                break;
            case R.id.one:
                Toast.makeText(this,"Computer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.two:
                Toast.makeText(this,"GamePad",Toast.LENGTH_SHORT).show();
                break;
            case R.id.three:
                Toast.makeText(this,"Camera",Toast.LENGTH_SHORT).show();
                break;
            case R.id.four:
                Toast.makeText(this,"Video",Toast.LENGTH_SHORT).show();
                break;
            case R.id.five:
                Toast.makeText(this,"Email",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
