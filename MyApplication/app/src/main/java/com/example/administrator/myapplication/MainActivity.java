package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final TextView text = (TextView) findViewById(R.id.textView);
        final EditText edit = (EditText) findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n;
                try {
                    n = Integer.parseInt(edit.getText().toString());
                    if (n % 2 == 0)
                        text.setText(n + "是偶数");
                    else
                        text.setText(n + "是奇数");
                } catch (Exception e) {
                    text.setText("输入错误，请输入有效数字！");
                }
            }
        });
    }
}
