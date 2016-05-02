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
final Button button = (Button ) findViewById(R.id.attendance);


        setContentView(R.layout.home_screen);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent1 = new Intent(mainmenu.this, attendance.class);
                startActivity(intent1);
            }

        }

        );


}
}

