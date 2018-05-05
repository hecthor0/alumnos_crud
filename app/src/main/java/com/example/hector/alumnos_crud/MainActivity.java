package com.example.hector.alumnos_crud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void Create (View c){
        Intent create = new Intent(this,create.class);
        startActivity(create);
    }
    protected void Read (View r){
        Intent read = new Intent(this,read.class);
        startActivity(read);
    }

    protected void Update (View u){
        Intent update = new Intent(this,update.class);
        startActivity(update);
    }
    protected void Delete (View d){
        Intent delete = new Intent(this,delete.class);
        startActivity(delete);
    }
}
