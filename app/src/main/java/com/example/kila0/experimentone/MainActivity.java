package com.example.kila0.experimentone;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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

        Button button1 = (Button) findViewById(R.id.button11);
        Button button2 = (Button) findViewById(R.id.button12);
        final RadioGroup radioGroup1 = (RadioGroup)  findViewById(R.id.personselect);
        final RadioButton radioButton1= (RadioButton) findViewById(R.id.button1);
        final RadioButton radioButton2= (RadioButton) findViewById(R.id.button2);
        final RadioButton radioButton3= (RadioButton) findViewById(R.id.button3);
        final RadioButton radioButton4= (RadioButton) findViewById(R.id.button4);

        final AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(this);
        final AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(this);
        final EditText username = (EditText) findViewById(R.id.edit1);
        final EditText password = (EditText) findViewById(R.id.edit2);

        alertDialog1.setTitle("提示").setMessage("登录成功").setPositiveButton("确定",
                    new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"对话框“确定”被点击",Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消",
                    new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"对话框“取消”被点击",Toast.LENGTH_SHORT).show();
                    }
                }).create();

        alertDialog2.setTitle("提示").setMessage("登录失败").setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"对话框“确定”被点击",Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"对话框“取消”被点击",Toast.LENGTH_SHORT).show();
                    }
                }).create();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(username.getText().toString())) {
                    Toast.makeText(MainActivity.this,"用户名不能为空",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this,"密码不能为空",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(username.getText().toString().equals("Android") && password.getText().toString().equals("123456"))
                        alertDialog1.show();
                    else alertDialog2.show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked()) {
                    Toast.makeText(MainActivity.this,"学生身份注册身份尚未开启",Toast.LENGTH_SHORT).show();
                }
                else if(radioButton2.isChecked()) {
                    Toast.makeText(MainActivity.this,"教师身份注册身份尚未开启",Toast.LENGTH_SHORT).show();
                }
                else if(radioButton3.isChecked()) {
                    Toast.makeText(MainActivity.this,"社团身份注册身份尚未开启",Toast.LENGTH_SHORT).show();
                }
                else if(radioButton4.isChecked()) {
                    Toast.makeText(MainActivity.this,"管理者身份注册身份尚未开启",Toast.LENGTH_SHORT).show();
                }
            }
        });

//        radioGroup1.setOnCheckedChangeListener(
//                new RadioGroup.OnCheckedChangeListener() {
//                    @Override
//                    public void onCheckedChanged(RadioGroup group, int checkedId) {
//                        RadioButton radioButton = (RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());
//                        Toast.makeText(getApplicationContext(), radioButton.getText().toString() + "身份被选中", Toast.LENGTH_SHORT).show();
//                    }
//                });
    }
}
