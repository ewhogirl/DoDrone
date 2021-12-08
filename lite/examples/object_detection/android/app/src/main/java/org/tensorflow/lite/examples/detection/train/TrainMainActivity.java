package org.tensorflow.lite.examples.detection.train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.assemble.AssemStep1Activity;

public class TrainMainActivity extends AppCompatActivity {
    Button step6, step7, step8, step9, step10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_main);

        step6 = findViewById(R.id.train_step_1);
        step7 = findViewById(R.id.train_step_2);
        step8 = findViewById(R.id.train_step_3);
        step9 = findViewById(R.id.train_step_4);
        step10 = findViewById(R.id.train_step_5);

        step6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepIntent = new Intent(getApplicationContext(), TrainStep1Activity.class);
                startActivity(stepIntent);
            }
        });

        step7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepIntent = new Intent(getApplicationContext(), TrainStep2Activity.class);
                startActivity(stepIntent);
            }
        });

        step8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepIntent = new Intent(getApplicationContext(), TrainStep3Activity.class);
                startActivity(stepIntent);
            }
        });

        step9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepIntent = new Intent(getApplicationContext(), TrainStep4Activity.class);
                startActivity(stepIntent);
            }
        });

        step10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepIntent = new Intent(getApplicationContext(), TrainStep5Activity.class);
                startActivity(stepIntent);
            }
        });
    }
}