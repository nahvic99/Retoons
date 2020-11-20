package com.audivision.nahvicdev.retoons;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

public class Fr_cap_06 extends AppCompatActivity {

    private PlayerView playerView;
    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_cap_06);
        playerView = findViewById(R.id.video_view);
    }

    protected  void onStart() {
        super.onStart();
        player = ExoPlayerFactory.newSimpleInstance(
                new DefaultRenderersFactory(this),
                new DefaultTrackSelector(), new DefaultLoadControl());

        playerView.setPlayer(player);


        DefaultDataSourceFactory dataSourceFactory= new DefaultDataSourceFactory(this, Util.getUserAgent(this, "ExoPlayer"));

        ExtractorMediaSource mediaSource6 = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("http://toons.ddns.net/Toons/Father_rock/6_fr.mp4"));
        ExtractorMediaSource mediaSource7 = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("http://toons.ddns.net/Toons/Father_rock/7_fr.mp4"));
        ExtractorMediaSource mediaSource8 = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("http://toons.ddns.net/Toons/Father_rock/8_fr.mp4"));
        ConcatenatingMediaSource concatenatedSource = new ConcatenatingMediaSource(mediaSource6, mediaSource7, mediaSource8);
        player.prepare(concatenatedSource);
        player.setPlayWhenReady(true);

    }

    protected void onStop(){
        super.onStop();
        playerView.setPlayer(null);
        player.release();
        player=null;
    }

}
