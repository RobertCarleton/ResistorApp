package com.example.miniproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentBand = 0;
    double resistorValue = 0;
    String tolerance = "null";
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tvDisplay);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Bands
    public void doBand1 (View view) {
        currentBand = 1;
    }
    public void doBand2 (View view) {
        currentBand = 2;
    }
    public void doBand3 (View view) {
        currentBand = 3;
    }
    public void doTolerance (View view) {
        currentBand = 4;
    }

    //Colours
    public void doBlack (View view) {
        if (currentBand == 1) {
            resistorValue = 0;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 0;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1;
        } else if (currentBand == 4){
            tolerance = "±0%";
        }
    }
    public void doBrown (View view) {
        if (currentBand == 1) {
            resistorValue = 1;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 1;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10;
        }else if (currentBand == 4){
            tolerance = "±1%";
        }
    }
    public void doRed (View view) {
        if (currentBand == 1) {
            resistorValue = 2;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 2;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100;
        }else if (currentBand == 4){
            tolerance = "±2%";
        }
    }
    public void doOrange(View view) {
        if (currentBand == 1) {
            resistorValue = 3;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 3;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000;
        }else if (currentBand == 4){
            tolerance = "±0%";
        }
    }
    public void doYellow (View view) {
        if (currentBand == 1) {
            resistorValue = 4;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 4;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000;
        }else if (currentBand == 4){
            tolerance = "±0%";
        }
    }
    public void doGreen (View view) {
        if (currentBand == 1) {
            resistorValue = 5;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 5;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100000;
        }else if (currentBand == 4){
            tolerance = "±0.5%";
        }
    }
    public void doBlue (View view) {
        if (currentBand == 1) {
            resistorValue = 6;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 6;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000000;
        }else if (currentBand == 4){
            tolerance = "±0.25%";
        }
    }
    public void doViolet (View view) {
        if (currentBand == 1) {
            resistorValue = 7;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 7;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000000;
        }else if (currentBand == 4){
            tolerance = "±0.1%";
        }
    }
    public void doGrey (View view) {
        if (currentBand == 1) {
            resistorValue = 8;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 8;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100000000;
        }else if (currentBand == 4){
            tolerance = "±0.05%";
        }
    }
    public void doWhite (View view) {
        if (currentBand == 1) {
            resistorValue = 9;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 9;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000000000;
        }else if (currentBand == 4){
            tolerance = "±0%";
        }
    }
    public void doGold (View view) {
        if (currentBand == 1) {
            resistorValue = 0;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 0.1;
        }else if (currentBand == 4){
            tolerance = "±5%";
        }
    }
    public void doSilver (View view) {
        if (currentBand == 1) {
            resistorValue = 0;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 0.01;
        } else if (currentBand == 4){
            tolerance = "±10%";
        }
    }

    //Calculate & Reset
    public void doCalculate (View view) {
        if (tolerance == "null"){
            tolerance = "±20%";
        }
        display.setText(String.valueOf(resistorValue) + "Ω " + tolerance);
    }
    public void doReset (View view) {
        display.setText("Resistor Value");
        resistorValue = 0;
        currentBand = 1;
        tolerance = "null";
    }
}