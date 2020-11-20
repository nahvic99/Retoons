package com.audivision.nahvicdev.retoons;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;

import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class Father_Rock extends AppCompatActivity {

    String[] EpisodeArray = {"Capitulo 01 - Bienvenidos a Remanso","Capitulo 02 - La casa del horror de Zilla","Capitulo 03 - El Opus de Sr.Zilla","Capitulo 04 - Alta infidelidad",
            "Capitulo 05 - Angela D Angelo", "Capitulo 06 - El candidato", "Capitulo 07 - Willy acustico", "Capitulo 08 - La fiesta"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father__rock);
        MobileAds.initialize(this, "ca-app-pub-2768901988841601~6368438083");
        final InterstitialAd mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2768901988841601/8849510625");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.fr, EpisodeArray);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_01.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_02.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_03.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_04.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_05.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_06.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_07.class);
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
                                    Intent myIntent = new Intent(view.getContext(), Fr_cap_08.class);
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


