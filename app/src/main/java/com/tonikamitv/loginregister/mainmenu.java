package com.tonikamitv.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joe on 02/05/2016.
 */
public class mainmenu extends AppCompatActivity {

    public void onCreate(){
        final Button attendance = (Button ) findViewById(R.id.attendance);
        final Button libary = (Button ) findViewById(R.id.libary);
        final Button studentcard = (Button) findViewById(R.id.studentcard);
        final Button payments = (Button) findViewById(R.id.payments);

        setContentView(R.layout.home_screen);

        attendance.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View view) {

                                              Intent intent1 = new Intent(mainmenu.this, attendance.class);
                                              startActivity(intent1);
                                          }

                                      }

        );

        libary.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View view) {

                                              Intent intent2 = new Intent(mainmenu.this, libary.class);
                                              startActivity(intent2);
                                          }

                                      }

        );
        studentcard.setOnClickListener(new View.OnClickListener() {

                                           public void onClick(View view) {

                                               Intent intent3 = new Intent(mainmenu.this, UserAreaActivity.class);
                                               startActivity(intent3);
                                           }

                                       }

        );

        payments.setOnClickListener(new View.OnClickListener() {

                                           public void onClick(View view) {

                                               Intent intent4 = new Intent(mainmenu.this, payments.class);
                                               startActivity(intent4);
                                           }

                                       }

        );

}
}

