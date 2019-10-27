package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
            btn_7, btn_8, btn_9, btn_Add, btn_Sub, btn_Div,
            btn_Mul, btn_clear, btn_dec, btn_equal;

    EditText edit1;

    float Value1, Value2;

    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        edit1 = (EditText) findViewById(R.id.edit1);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edit1 == null) {
                    edit1.setText("");
                } else {
                    Value1 = Float.parseFloat(edit1.getText() + "");
                    add = true;
                    edit1.setText(null);
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText() + "");
                sub = true;
                edit1.setText(null);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText() + "");
                mul = true;
                edit1.setText(null);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText() + "");
                div = true;
                edit1.setText(null);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(edit1.getText() + "");

                if (add == true) {
                    edit1.setText(Value1 + Value2 + "");
                    add = false;
                }

                if (sub == true) {
                    edit1.setText(Value1 - Value2 + "");
                    sub = false;
                }

                if (mul == true) {
                    edit1.setText(Value1 * Value2 + "");
                    mul = false;
                }

                if (div == true) {
                    edit1.setText(Value1 / Value2 + "");
                    div = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + ".");
            }
        });
    }

}
