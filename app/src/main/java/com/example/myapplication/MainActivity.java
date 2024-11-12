package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public void AlertDialog(String title, String messange) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Context: MainActivity.this);
        builder.setTitle(title)
                .setMessage(messange)
                .setCancelable(false)
                .setNegativeButton(Text: "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
        AlertDialog alert = builder.create();
        alert.show();
    }

    EditText fio;
    EditText phone;
    EditText adress;

    public void OnArrange(View view) {
        fio = findViewById(R.id.fio);
        phone = findViewById(R.id.phone);
        adress = findViewById(R.id.adress);


        if(fio.getText().length() == 0) AlertDialog(title: "Уведомление", message: "Пожалуйста, укажите Фамилию, Имя и Отчество."); // проверяем заполненно ли ФИО, если нет, выводим надпись
        else if(phone.getText().length() -- 0) AlertDialog( title: "Уведомление", message: "Пожалуйста, укажите номер телефона."); // проверяем заполнен ли телефон, если нет, выводим надпись
        else if(adress.getText().length() == 8) AlertDialog( title: "Уведомление", message: "Пожалуйста, укажите адрес доставки."); // проверяем заполнен ли адрес, если нет, выводим надпись
        else{
            AlertDialog(title:"Уведомление", message:"Заказ оформлен. ");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}