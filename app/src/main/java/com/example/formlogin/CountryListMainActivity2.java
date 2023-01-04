package com.example.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CountryListMainActivity2 extends AppCompatActivity {

    private ListView lvCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list_main2);

        lvCountries = findViewById(R.id.lvCountry);

        String[] countries = new String[]{
                "VietNam", "Lao", "Campuchia", "Mianma"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countries);

        lvCountries.setAdapter(adapter);

        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CountryListMainActivity2.this,
                        "Selected Country: " + countries[i] , Toast.LENGTH_SHORT).show();
            }
        });
    }
}