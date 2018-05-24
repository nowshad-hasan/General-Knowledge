package com.example.summithaque.generalknowledge;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    /**
     * onClick method for ???????? button
     */
    public void banglaMethod(View view){
        Intent intent = new Intent(this , BanFirst.class);

        startActivity(intent);
    }

    /**
     * onClick method for ??????????? button
     */
    public void worldMethod(View view){
        Intent intent = new Intent(this, WorFirst.class);

        startActivity(intent);
    }

    /**
     * onClick methid for ?????  button
     */
    public void otherMethod(View view){
        Intent intent = new Intent(this, OtherFirst.class);

        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
