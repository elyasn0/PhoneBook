package com.bignerdranch.android.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowInfo(View view) {
        Intent intent = new Intent(this, DeviceInfo.class);
        startActivity(intent);
        Toast.makeText(this,"переход к информации об устройстве",Toast.LENGTH_LONG).show();
    }

    public void Search(View view) {
        TextView textViewList =findViewById(R.id.textViewList);
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
    }

    public void Clean(View view) {
        Toast.makeText(this,"Очиста записей",Toast.LENGTH_LONG).show();
    }
}