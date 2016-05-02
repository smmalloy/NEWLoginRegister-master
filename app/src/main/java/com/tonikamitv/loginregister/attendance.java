package com.tonikamitv.loginregister;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joe on 28/04/2016.
 */
public class attendance extends AppCompatActivity {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.attendance);

        final Button home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View view) {

                                        Intent intent1 = new Intent(attendance.this, mainmenu.class);
                                        startActivity(intent1);
                                    }

                                }

        );

    }



}
