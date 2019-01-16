package com.example.lab_2_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.eng_button).setOnClickListener(this);
        findViewById(R.id.swe_button).setOnClickListener(this);
        findViewById(R.id.fi_button).setOnClickListener(this);
        findViewById(R.id.su_button).setOnClickListener(this);


    }

    private String getTextFieldText(){
        EditText editor = findViewById(R.id.text_editor);
        String text = editor.getText().toString();
        return text;
    }

    @Override
    public void onClick(View view) {
        TextView textField = findViewById(R.id.textView);
        String name = getTextFieldText();

        if (view.getId() == R.id.eng_button){
            textField.setText("Hi " + name);
        }
        else if (view.getId() == R.id.swe_button){
            textField.setText("Hejjsan " + name);
        }
        else if (view.getId() == R.id.fi_button){
            textField.setText("Terve " + name);
        }
        else if (view.getId() == R.id.su_button){
            textField.setText("Hola " + name);
        }
    }
}
