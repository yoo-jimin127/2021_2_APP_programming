package com.example.helloandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button btnAdd,btnMin,btnMul,btnDiv,btnExt;
    String num1,num2;
    TextView textResult;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);

        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnMin=(Button)findViewById(R.id.btnMin);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnExt=(Button)findViewById(R.id.btnExt);

        textResult=(TextView)findViewById(R.id.TextRes);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")||num2.trim().equals("")) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "값을 입력하지 않고 버튼을 클릭할 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
                                  });

        btnMin.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")||num2.trim().equals("")) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "값을 입력하지 않고 버튼을 클릭할 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")||num2.trim().equals("")) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "값을 입력하지 않고 버튼을 클릭할 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                String zero = "0";

                if (num1.trim().equals("")||num2.trim().equals("")) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "값을 입력하지 않고 버튼을 클릭할 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else if (num2.equals(zero)) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnExt.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")||num2.trim().equals("")) {
                    Toast myToast = Toast.makeText(getApplicationContext(), "값을 입력하지 않고 버튼을 클릭할 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}


