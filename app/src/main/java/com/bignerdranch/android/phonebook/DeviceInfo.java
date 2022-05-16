package com.bignerdranch.android.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class DeviceInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        TextView textView =findViewById(R.id.text_device_info);
        textView.setText(new StringBuilder().append("Инвормация об устройстве:\n").append("Бренд: ").
                append(Build.PRODUCT).append("\n").append("Модель: ").append(Build.DEVICE).append("\n").
                append("Сборка: ").append(Build.MANUFACTURER).append("\n").append("Версия ОС: ").
                append(Build.VERSION.SDK_INT).toString()
        );
    }
}