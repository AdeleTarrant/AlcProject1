package com.adeletarrant.alcproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButton2();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button1 = (Button) findViewById(R.id.buttonALC);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, AlcActivity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton2() {

        final Context context = this;

        button02 = (Button) findViewById(R.id.buttonPro);

        button02.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ProfileActivity.class);
                startActivity(intent);

            }

        });


    }

}
