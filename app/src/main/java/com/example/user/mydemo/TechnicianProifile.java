package com.example.user.mydemo;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TechnicianProifile extends AppCompatActivity {
    Button button;
    TextView technicianName, technicianContact, rating, servicesRequests, experience, hebelongsto, spName, spContactNo;
    String techinician_Name, technician_Contact;
    long technicianId;
    int technicianContactId;
    Bundle bundleanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician_proifile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button = (Button) findViewById(R.id.OK);
        technicianName = (TextView) findViewById(R.id.technicianName);
        technicianContact = (TextView) findViewById(R.id.technicianContact);
        rating = (TextView) findViewById(R.id.technicianRating);
        servicesRequests = (TextView) findViewById(R.id.requestServiced);
        experience = (TextView) findViewById(R.id.experiance);
        hebelongsto = (TextView) findViewById(R.id.technicianRating);
        spName = (TextView) findViewById(R.id.spName);
        spContactNo = (TextView) findViewById(R.id.spContact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}




            /** button = (Button) findViewById(R.id.OK);
        *tv = (TextView) findViewById(R.id.);
        *LinearLayout linearLayout = new LinearLayout(this);
        *LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        *technicianName technician1 = new technicianName(this);
        *technician1.setText("technicianName");
        *technicianContact technician2 = new technicianContact(this);
        *technician2.setText("technicianContact");
        *spName technician3 = new spName(this);
        *technician3.setText("spName");
        *spContactNo technician4 = new spContactNo(this);
        *technician4.setText("spContactNo");
        *AddtechnicianName(technicianName, LinearLayout);
        *AddButtonLayout(technicianContact, LinearLayout);
        *AddButtonLayout(spName, LinearLayout);
        *AddspContactNo(spContactNo,LinearLayout);
        *linearLayout.addView(technicianName);
        *linearLayout.addView(technicianContact);
        *linearLayout.addView(spName);
        *linearLayout.addView(spContactNo);
        *setContentView(linearLayout, linearLayoutParams);
    *}
    *private void LayoutAddButton(Button button, int centerInParent, int marginLeft, int marginTop, int marginRight, int marginBottom)
*/









