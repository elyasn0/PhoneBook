package com.bignerdranch.android.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewList=findViewById(R.id.textViewList);
    }

    public void ShowInfo(View view) {
        Intent intent = new Intent(this, DeviceInfo.class);
        startActivity(intent);
        Toast.makeText(this,"переход к информации об устройстве",Toast.LENGTH_LONG).show();
    }

    public void Search(View view) {
        Toast.makeText(this,"начало поиска номеров по имени",Toast.LENGTH_LONG).show();
        textViewList.setText(new StringBuilder().append("TESTDATA:\nИмя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                append("Имя:Иван Номер: 89507587596\n").append("Имя:Иван Номер: 89507587596\n").
                toString());
    }

    public void Add(View view) {
        Toast.makeText(this,"добавление новой записи",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, NewContactActivity.class);
        startActivity(intent);
    }

    public void Clean(View view) {
        Toast.makeText(this,"Очиста записей",Toast.LENGTH_LONG).show();
        textViewList.setText(null);
    }
}