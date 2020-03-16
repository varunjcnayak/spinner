package com.example.empty;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {





    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Spinner divisionSP, lun, din,exr;

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            divisionSP = findViewById(R.id.simpleSpinner);
            lun = findViewById(R.id.simpleSpinner1);
            din = findViewById(R.id.simpleSpinner2);
            exr = findViewById(R.id.simpleSpinner3);

            final String[] Breakfast = {"0","300", "400", "500", "600", "700", "800"};
            final String[] Lunch = {"0","300", "400", "500", "600", "700", "800"};
            final String[] Dinner = {"0","300", "400", "500", "600", "700", "800"};
            final String[] Exercise = {"0","300", "400", "500", "600", "700", "800"};
            int position;
            TextView a=(TextView)findViewById(R.id.food);
            final ArrayAdapter<String> adapter;
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Breakfast);

            divisionSP.setAdapter(adapter);

            divisionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String bre = Breakfast[i];
                    sum+=Integer.parseInt(bre);
                    TextView a=(TextView)findViewById(R.id.food);
                   a.setText(String.valueOf(sum));
                                Toast.makeText(MainActivity.this, "" + Breakfast[i], Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
         ///Lunch
        final ArrayAdapter<String> adapte;
        adapte = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Lunch);

        lun.setAdapter(adapte);

        lun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i1, long l) {
                String lun1 = Lunch[i1];
                sum+=Integer.parseInt(lun1);
                TextView a=(TextView)findViewById(R.id.food);
                a.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "" + Lunch[i1], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    ///Dinner
        final ArrayAdapter<String> adapt;
        adapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Dinner);

        din.setAdapter(adapt);

        din.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long l) {
                String din1 = Dinner[i2];
                sum+=Integer.parseInt(din1);
                TextView a=(TextView)findViewById(R.id.food);
                a.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "" + Dinner[i2], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
     ////exercise
        final ArrayAdapter<String> adap;
        adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Exercise);

        exr.setAdapter(adapter);

       exr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i3, long l) {
                String exr1 = Exercise[i3];
                TextView a1=(TextView)findViewById(R.id.exercise);
                a1.setText(exr1);
                TextView a2 = (TextView) findViewById(R.id.editText);
                int e;
                e = Integer.parseInt(String.valueOf(exr1));
                int res;
                res = 6900 - sum - e;

                a2.setText(String.valueOf(res));

                Toast.makeText(MainActivity.this, "" + Exercise[i3], Toast.LENGTH_SHORT).show();
            }


           @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });













        }

}
