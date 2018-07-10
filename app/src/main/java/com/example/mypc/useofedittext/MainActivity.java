package com.example.mypc.useofedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String name = e1.getText().toString();
                if(name.equals(""))
                {
                    e1.setError("Please Enter Name");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Welcome to DUCAT....Mr. " + name, Toast.LENGTH_SHORT).show();
                    e1.setText("");
                }
            }
        });
    }
}
