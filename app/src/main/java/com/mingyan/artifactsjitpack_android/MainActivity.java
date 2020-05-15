package com.mingyan.artifactsjitpack_android;
/**uploading / publish artifacts to the JitPack, first time.
 * 1_create android app
 * 2_File > New > New Module > Android Library > input class / code finish
 * 3_VCS > Import into Version Control > Share Project on GitHub*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
