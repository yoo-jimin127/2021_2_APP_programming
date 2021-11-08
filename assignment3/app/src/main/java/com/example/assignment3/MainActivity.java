package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd,btnMin,btnMul,btnDiv;
    TextView textRes;
    String num1,num2;
    Integer res;
    Button[] numButtons=new Button[10];
    Integer[] numBtnIds={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,
            R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드레이아웃 계산기");

        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnMin=(Button)findViewById(R.id.btnMin);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        textRes=(TextView)findViewById(R.id.textRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                res=Integer.parseInt(num1)+Integer.parseInt(num2);
                textRes.setText("계산결과 : "+res.toString());
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                res=Integer.parseInt(num1)-Integer.parseInt(num2);
                textRes.setText("계산결과 : "+res.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                res=Integer.parseInt(num1)*Integer.parseInt(num2);
                textRes.setText("계산결과 : "+res.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                res=Integer.parseInt(num1)/Integer.parseInt(num2);
                textRes.setText("계산결과 : "+res.toString());
            }
        });

        for(i=0;i<numBtnIds.length;i++)
            numButtons[i]=(Button)findViewById(numBtnIds[i]);

        for(i=0;i<numBtnIds.length;i++) {
            final int index;
            index=i;
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edit1.isFocused()==true)
                    {
                        num1=edit1.getText().toString()+numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }
                    else if(edit2.isFocused()==true)
                    {
                        num2=edit2.getText().toString()+numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"잘못된 입력입니다.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}