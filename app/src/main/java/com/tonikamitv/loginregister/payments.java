package com.tonikamitv.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by joe on 02/05/2016.
 */
public class payments extends AppCompatActivity {
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.payment_services);

        final Button home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View view) {

                                        Intent intent1 = new Intent(payments.this, mainmenu.class);
                                        startActivity(intent1);
                                    }

                                }

        );
    }
}
