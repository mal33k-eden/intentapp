package uk.ac.tees.v8218996.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText);

        btn_submit = findViewById(R.id.button);



        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString().trim();

                if(username != null){
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra( "name", username);
                    startActivity(intent);
                }


            }
        });

    }

    protected void retriveUserName(View v){


    }
}
