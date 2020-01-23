package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = findViewById(R.id.coordinatorlayout);

        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showsnackbar();

            }
        });
    }


public void showsnackbar() {
    Snackbar snackbar = Snackbar.make(coordinatorLayout, "This is snackbar",Snackbar.LENGTH_INDEFINITE)
            .setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar snackbar1= Snackbar.make(coordinatorLayout, "UNDO SUCCESSFULL", Snackbar.LENGTH_SHORT);
                    snackbar1.show();
                }
            })
            .setActionTextColor(Color.RED);

    /*

    View snackView = snackbar.getView();
    TextView textView = snackView.);
    textView.setTextColor(Color.YELLOW);
*/

    snackbar.show();
}}