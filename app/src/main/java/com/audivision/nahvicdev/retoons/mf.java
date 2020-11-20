package com.audivision.nahvicdev.retoons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class mf extends AppCompatActivity {

    String[] EpisodeArray = {"Capitulo 01 - La casa de Bloo Parte 1","Capitulo 02 - La casa de Bloo Parte 2","Capitulo 03 - La casa de Bloo Parte 3","Capitulo 04 - Atrapado",
            "Capitulo 05 - Hora De Cenar", "Capitulo 06 - Dia De Adopcion", "Capitulo 07 - Visita al centro comercial", "Capitulo 08 - Bloooo"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mf);
        MobileAds.initialize(this, "ca-app-pub-2768901988841601~6368438083");
        final InterstitialAd mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2768901988841601/8849510625");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.mf, EpisodeArray);
        ListView listView = (ListView) findViewById(R.id.episode_list);
        listView.setAdapter(adapter);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {


                        if (position == 0) {
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), mf_cap_01.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 1) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), mf_cap_02.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 2) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_03.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 3) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_04.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 4) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_05.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 5) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_06.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 6) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_07.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        } else if (position == 7) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), Mf_cap_08.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        }
                    }
                }
        );
    }
    }
