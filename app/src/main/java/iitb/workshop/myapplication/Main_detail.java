package iitb.workshop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_detail extends AppCompatActivity {

    TextView name,email,mobile;
    Button home;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name =findViewById(R.id.name_dit);
        email=findViewById(R.id.email_dit);
        mobile=findViewById(R.id.mobile_dit);
        home=findViewById(R.id.button);

        in = getIntent();

        name.setText(in.getExtras().getString("myName"));
        mobile.setText(in.getExtras().getString("mymobile"));
        email.setText(in.getExtras().getString("myemail"));
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });

    }
}