package com.audivision.nahvicdev.retoons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;


public class OzzyDrix extends AppCompatActivity {

    String[] EpisodeArray = {"Capitulo 01 - En Casa de Hector","Capitulo 02 - Reflejos","Capitulo 03 - Extretollamas","Capitulo 04 - Intruso en el Cabello",
            "Capitulo 05 - Tarde De Perros", "Capitulo 06 - Callejero", "Capitulo 07 - Un Gas Incomodo", "Capitulo 08 - Donde hay Humo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozzy_drix);
        MobileAds.initialize(this, "ca-app-pub-2768901988841601~6368438083");
        final InterstitialAd mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2768901988841601/8849510625");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.od, EpisodeArray);
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
                                Intent myIntent = new Intent(view.getContext(), OD_cap_01.class);
                                startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 1) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_02.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 2) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_03.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 3) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_04.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 4) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_05.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 5) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_06.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 6) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_07.class);
                                        startActivity(myIntent);
                                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                    }
                                });
                            } else if (position == 7) {
                                // Abre una nueva Activity:
                                mInterstitialAd.show();
                                mInterstitialAd.setAdListener(new AdListener() {
                                    @Override
                                    public void onAdClosed() {
                                        Intent myIntent = new Intent(view.getContext(), OD_cap_08.class);
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







