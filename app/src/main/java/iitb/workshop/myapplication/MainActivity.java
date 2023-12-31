package iitb.workshop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText name,email,mobile;
Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =findViewById(R.id.Name_et);
        email=findViewById(R.id.Email_et);
        mobile=findViewById(R.id.Mobile_et);
        submitBtn=findViewById(R.id.button);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),Main_detail.class);
                String nameValue = name.getText().toString();
                in.putExtra("myName",nameValue);
                in.putExtra("myemail",email.getText().toString());
                in.putExtra("mymobile",mobile.getText().toString());
                startActivity(in);

            }
        });
    }
}