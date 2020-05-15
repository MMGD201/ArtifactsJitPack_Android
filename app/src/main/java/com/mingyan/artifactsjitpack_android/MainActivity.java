package com.mingyan.artifactsjitpack_android;
/**20200515 AndroidStudio3.5.3
 * uploading / publish artifacts to the JitPack, first time.
 * 1_create android app
 * 2_File > New > New Module > Android Library > input class / code finish
 * 3_VCS > Import into Version Control > Share Project on GitHub
 * ( 4_VCS > Git > push )
 * 5_view Artifacts's  URL from GitHub
 * 6_past at https://jitpack.io/ home page > press Look up Button, if no release.
 * 6_When view the artifacts's URL and release is 0 , press releases and press Create new release > 填上Tag version( 例 : 0.1.0 ) > 填上Release title( 例 : home work, test 1. ) > press Publish release ( 勾勾原本沒勾也不用勾)
 * 7_past at https://jitpack.io/ home page and press Look up Button again, we see Version 0.1.0
 * 8_publish artifacts complete, close artifacts project.*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
