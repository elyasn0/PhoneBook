package com.bignerdranch.android.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);
    }

    public void AddNewContact(View view) {
        Toast.makeText(this,"новая запись добавлена",Toast.LENGTH_LONG).show();
    }
}