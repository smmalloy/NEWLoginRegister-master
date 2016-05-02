package com.tonikamitv.loginregister;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final Button home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View view) {

                                              Intent intent1 = new Intent(UserAreaActivity.this, mainmenu.class);
                                              startActivity(intent1);
                                          }

                                      }

        );

    }

}
