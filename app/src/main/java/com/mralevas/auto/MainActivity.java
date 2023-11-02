package com.mralevas.auto;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        countriesList = findViewById(R.id.countriesList);
        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item, states);
        countriesList.setAdapter(stateAdapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный автомобиль
                State selectedState = (State)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран автомобиль " + selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);


    }
    private void setInitialData(){

        states.add(new State("Audi", "Audi a A8", R.drawable.audi));
        states.add(new State("BMW", "BMW M3", R.drawable.bmw));
        states.add(new State("Toyota", "Toyota Supra", R.drawable.toyota));
        states.add(new State("Porsche", "Porsche 911", R.drawable.porsche));
        states.add(new State("Lamborghini", "Lamborghini Urus", R.drawable.lamborghini));
        states.add(new State("Volkswagen","Volkswagen Golf",R.drawable.volkswagen));
        states.add(new State("Mercedes","Mercedes-AMG CLS 53",R.drawable.mesrsedes));

    }
}