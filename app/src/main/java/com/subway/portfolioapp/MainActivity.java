package com.subway.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) this.findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = (Button) this.findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my stock hawk app!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn3 = (Button) this.findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn4 = (Button) this.findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my make your app material app!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn5 = (Button) this.findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my go ubiquitous app!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn6 = (Button) this.findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
