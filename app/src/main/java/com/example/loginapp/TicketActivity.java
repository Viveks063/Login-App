package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TicketActivity extends AppCompatActivity {

    TextView ticketshow;
    Button Done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        ticketshow = findViewById(R.id.ticketshow);
        Done = findViewById(R.id.Done);

        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });


        if (getIntent() != null && getIntent().getExtras() != null) {
            String sourcetext = getIntent().getStringExtra("Source");
            String desttext = getIntent().getStringExtra("Destination");
            String noOftravel = getIntent().getStringExtra("Count");


            if (sourcetext != null && desttext != null && noOftravel != null) {

                ticketshow.setText("Source: " + sourcetext + "\nDestination: " + desttext + "\nNumber of travelers: " + noOftravel);
            } else {

            }
        } else {

        }
    }

}
