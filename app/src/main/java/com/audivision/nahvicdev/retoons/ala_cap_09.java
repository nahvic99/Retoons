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

public class ala_cap_09 extends AppCompatActivity {

    private PlayerView playerView;
    private ExoPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ala_cap_09);
        playerView = findViewById(R.id.video_view);
    }

    protected  void onStart() {
        super.onStart();
        player = ExoPlayerFactory.newSimpleInstance(
                new DefaultRenderersFactory(this),
                new DefaultTrackSelector(), new DefaultLoadControl());

        playerView.setPlayer(player);


        DefaultDataSourceFactory dataSourceFactory= new DefaultDataSourceFactory(this, Util.getUserAgent(this, "ExoPlayer"));

        ExtractorMediaSource mediaSource9 = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("https://content-na.drive.amazonaws.com/cdproxy/share/rEzP1QWcyyxoYimwGidMXJmclO9RybjMKf7cdQ4MBQz/nodes/9IaJa5RbSaa0mKka7BQTmw?nonce=ADugSPqs-YPZZrFst89Hp5tjNChRDz7SDWEBYuKInP6BcuxhK5rZIZxRRhEXJdRm"));
        ConcatenatingMediaSource concatenatedSource = new ConcatenatingMediaSource(mediaSource9);
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
