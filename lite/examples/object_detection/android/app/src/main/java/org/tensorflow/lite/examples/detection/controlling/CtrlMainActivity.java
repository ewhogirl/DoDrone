package org.tensorflow.lite.examples.detection.controlling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.assemble.AssemStep1Activity;

public class CtrlMainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentUrl = new Intent(Intent.ACTION_VIEW, Uri.parse("https://copycoding.tistory.com/"));
        startActivity(intentUrl);
    }
}