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

public class knd extends AppCompatActivity {

    String[] EpisodeArray = {"Capitulo 01 - operacion P.A.S.T.E.L","Capitulo 02 - operacion H.E.L.A.D.O - C.A.Ñ.O.N","Capitulo 03 - operacion R.O.E.D.O.R - C.E.P.I.L.L.O","Capitulo 04 - operacion P.I.R.A.T.A - V.A.Q.U.E.R.A",
            "Capitulo 05 - operacion N.A.B.O", "Capitulo 06 - operacion M.I.N.I.G.O.L.F", "Capitulo 07 - operacion O.F.I.C.I.N.A - A.R.T.I.C.O", "Capitulo 08 - Operacion P.I.O.J.O. - L.I.Z.Z.I.E."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knd);
        MobileAds.initialize(this, "ca-app-pub-2768901988841601~6368438083");
        final InterstitialAd mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2768901988841601/8849510625");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.knd, EpisodeArray);
        ListView listView = (ListView) findViewById(R.id.episode_list);
        listView.setAdapter(adapter);

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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_01.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_02.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_03.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_04.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_05.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_06.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Knd_cap_07.class);
                                    startActivity(myIntent);
                                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                }
                            });
                        }else if (position == 7) {
                            // Abre una nueva Activity:
                            // Abre una nueva Activity:
                            mInterstitialAd.show();
                            mInterstitialAd.setAdListener(new AdListener() {
                                @Override
                                public void onAdClosed() {
                                    Intent myIntent = new Intent(view.getContext(), knd_cap_08.class);
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

