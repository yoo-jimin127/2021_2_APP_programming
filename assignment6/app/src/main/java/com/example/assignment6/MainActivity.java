package com.example.assignment6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main");

        final EditText edt1 = findViewById(R.id.editNum1);
        final EditText edt2 = findViewById(R.id.editNum2);

        final RadioGroup rdg = findViewById(R.id.radioGrp);

        RadioButton rd_add = findViewById(R.id.add);
        RadioButton rd_minus = findViewById(R.id.minus);
        RadioButton rd_mul = findViewById(R.id.mul);
        RadioButton rd_div = findViewById(R.id.div);

        Button next_activity = findViewById(R.id.calcBtn);

        next_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),secondActivity.class);
                int i = rdg.getCheckedRadioButtonId();

                if (i == R.id.add){
                    intent.putExtra("rst",'+');
                }
                else if(i == R.id.minus){
                    intent.putExtra("rst",'-');
                }
                else if(i == R.id.mul){
                    intent.putExtra("rst",'*');
                }
                else if(i == R.id.div){
                    intent.putExtra("rst",'/');
                }
                intent.putExtra("num1",Integer.parseInt(edt1.getText().toString()));
                intent.putExtra("num2",Integer.parseInt(edt2.getText().toString()));

                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            int fin_rst = data.getIntExtra("rst",0);
            Toast.makeText(getApplicationContext(), "결과: "+  fin_rst, Toast.LENGTH_LONG).show();
        }

    }
}