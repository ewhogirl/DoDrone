package org.tensorflow.lite.examples.detection.assemble;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.dodrone.LoginActivity;
import org.tensorflow.lite.examples.detection.R;
//import com.example.dodrone.User;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class AssemStep4Activity extends AppCompatActivity {
    private static int STATUS_NUM4 = 4;
    Button nextStep4;
    //FirebaseUser currUser = FirebaseAuth.getInstance().getCurrentUser();
    //User thisUser = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("stack", "assem_4");
        setContentView(R.layout.activity_assem_step4);
        //thisUser.retrieveUserInfo(currUser);
        ArrayList<String> userInfo = new ArrayList<>();
        //thisUser.retrieveUserInfo(currUser, thisUser.listener);

        nextStep4 = findViewById(R.id.nextStep_4);
        nextStep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AssemStep5Activity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //intent.putExtra("EXIT", true);
                startActivity(intent);
                finish();
                //finishAffinity();


                //thisUser.updateStatus(STATUS_NUM4);

            }
        });
    }
}