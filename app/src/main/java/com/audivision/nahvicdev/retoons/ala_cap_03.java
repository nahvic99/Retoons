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

public class ala_cap_03 extends AppCompatActivity {

    private PlayerView playerView;
    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ala_cap_03);
        playerView = findViewById(R.id.video_view);

    }

    protected  void onStart() {
        super.onStart();
        player = ExoPlayerFactory.newSimpleInstance(
                new DefaultRenderersFactory(this),
                new DefaultTrackSelector(), new DefaultLoadControl());

        playerView.setPlayer(player);


        DefaultDataSourceFactory dataSourceFactory= new DefaultDataSourceFactory(this, Util.getUserAgent(this, "ExoPlayer"));

        ExtractorMediaSource mediaSource3 = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("https://content-na.drive.amazonaws.com/cdproxy/share/rEzP1QWcyyxoYimwGidMXJmclO9RybjMKf7cdQ4MBQz/nodes/hhSRndV7TpqR4LSmm8Mo2w?nonce=7_jq6xDMIwXrVr0q9Gt98QdRx84zJ_qhy_YG5g0tx4tsgnqaBIq03dawdVJJRIru"));
        ConcatenatingMediaSource concatenatedSource = new ConcatenatingMediaSource(mediaSource3);
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
