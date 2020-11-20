package com.audivision.nahvicdev.retoons;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-2768901988841601~6368438083");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2768901988841601/1674390896");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        mAdView = findViewById(R.id.adView);
        mAdView.loadAd(adRequest);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


    }

    @Override
    protected void onStop()
    {
        super.onStop();
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


    }

    protected void onPause()
    {
        super.onPause();

        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mAdView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAdView.destroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdView.resume();
    }

    public void od(View view) {

        CardView cv0 = (CardView) findViewById(R.id.Card0);
        cv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentOD = new Intent(MainActivity.this, OzzyDrix.class);
                    startActivity(intentOD);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentOD = new Intent(MainActivity.this, OzzyDrix.class);
                startActivity(intentOD);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }


    public void fr(View view) {

        CardView cv1 = (CardView) findViewById(R.id.Card1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentFr = new Intent(MainActivity.this, Father_Rock.class);
                    startActivity(intentFr);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentFr = new Intent(MainActivity.this, Father_Rock.class);
                startActivity(intentFr);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void dgc(View view) {

        CardView cv2 = (CardView) findViewById(R.id.Card2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentDgc = new Intent(MainActivity.this, Dgc.class);
                    startActivity(intentDgc);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentDgc = new Intent(MainActivity.this, Dgc.class);
                startActivity(intentDgc);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void sm(View view) {

        CardView cv3 = (CardView) findViewById(R.id.Card3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentDgc = new Intent(MainActivity.this, sm.class);
                    startActivity(intentDgc);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentSm = new Intent(MainActivity.this, sm.class);
                startActivity(intentSm);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Avatar(View view) {

        CardView cv4 = (CardView) findViewById(R.id.Card4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentAvatar = new Intent(MainActivity.this, Avatar.class);
                    startActivity(intentAvatar);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentAvatar = new Intent(MainActivity.this, Avatar.class);
                startActivity(intentAvatar);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void DGA(View view) {

        CardView cv5 = (CardView) findViewById(R.id.Card5);
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentDga = new Intent(MainActivity.this, Dga.class);
                    startActivity(intentDga);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentDga = new Intent(MainActivity.this, Dga.class);
                startActivity(intentDga);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void mf(View view) {

        CardView cv6 = (CardView) findViewById(R.id.Card6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentDga = new Intent(MainActivity.this, mf.class);
                    startActivity(intentDga);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentDga = new Intent(MainActivity.this, mf.class);
                startActivity(intentDga);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void knd(View view) {

        CardView cv7 = (CardView) findViewById(R.id.Card7);
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Intent intentKnd = new Intent(MainActivity.this, knd.class);
                    startActivity(intentKnd);
                }
            }
        });


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intentKnd = new Intent(MainActivity.this, knd.class);
                startActivity(intentKnd);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Send(View view) {
        Button Btn_send = findViewById(R.id.contact);
        Btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] TO = {"developerordie@gmail.com"}; //aquí pon tu correo
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
// Esto podrás modificarlo si quieres, el asunto y el cuerpo del mensaje
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Retoons");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Sugerencias:");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Enviar email..."));

                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this,
                            "No tienes clientes de email instalados.", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }


}



