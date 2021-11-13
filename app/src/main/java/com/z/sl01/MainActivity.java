package com.z.sl01;

import android.os.Bundle;
import android.os.Environment;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private final File mInFile = new File(Environment.getExternalStorageDirectory(), "/Music/0.pcm");

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playPCM(mInFile.getAbsolutePath());
    }

    private native void playPCM(String absolutePath);
}