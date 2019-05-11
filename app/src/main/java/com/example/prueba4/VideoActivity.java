package com.example.prueba4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.net.Uri;

public class VideoActivity extends AppCompatActivity {
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //   botonGato = (ImageButton)findViewById(R.id.botonGato);
        video = (VideoView) findViewById(R.id.videoView);
        // Uri path= Uri.parse("android.resource://com")
        String path = "android.resource://" + getPackageName() + "/" + R.raw.vperro;
        video.setVideoURI(Uri.parse(path));
        video.setVideoPath(path);
        video.start();
        // startActivity(new Intent(Main2Activity.this, MainActivity.class));
    }
}
