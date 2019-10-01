package com.example.playvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView;
        videoView = (VideoView)findViewById(R.id.videoView);
        //videoView.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");
        videoView.setVideoPath("http://192.168.151.10:3000/home/coder01/work/src/home/star.mp4");
        videoView.start();






    }
}
