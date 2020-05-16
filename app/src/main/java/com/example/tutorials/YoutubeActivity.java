package com.example.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends AppCompatActivity {

    YouTubePlayerView youtubeView;
    Button button;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        button = (Button) findViewById(R.id.btnYoutube);
        youtubeView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("vewH-f3fAes");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                youtubeView.initialize("AIzaSyDWeDT9BxiATAPNENfvTV_JCdPOSi8P2Ts", listener);
            }
        });

    }

    public void onBackButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌러써요.", Toast.LENGTH_LONG).show();
        finish();
    }
}
