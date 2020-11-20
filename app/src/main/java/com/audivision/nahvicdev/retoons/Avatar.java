package com.audivision.nahvicdev.retoons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Avatar extends AppCompatActivity {

    String[] EpisodeArray = {"Capitulo 01 - El Niño en el iceberg","Capitulo 02 - El Regreso del Avatar","Capitulo 03 - El Templo del Aire del sur","Capitulo 04 - Los Guerreros de Kyoshi",
            "Capitulo 05 - El Rey de Omashu", "Capitulo 06 - Prisioneros", "Capitulo 07 - El Mundo de los espiritus (Solsticio De inverno, Parte 1)", "Capitulo 08 - El Avatar Roku (Solsticio De Invierno, Parte 2)", "Capitulo 09 - El Pergamino de los Maestros Agua"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.ala, EpisodeArray);
        ListView listView = (ListView) findViewById(R.id.episode_list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (position == 0){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_01.class);
                            startActivity(myIntent);
                        }else if(position == 1){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_02.class);
                        }else if(position == 2){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_03.class);
                        }else if(position == 3){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_04.class);
                        }else if(position == 4){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_05.class);
                        }else if(position == 5){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_06.class);
                        }else if(position == 6){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_07.class);
                        }else if(position == 7){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_08.class);
                        }else if(position == 8){
                            // Abre una nueva Activity:
                            Intent myIntent = new Intent(view.getContext(), ala_cap_09.class);
                        }



                    }
                }
        );
    }



    }


