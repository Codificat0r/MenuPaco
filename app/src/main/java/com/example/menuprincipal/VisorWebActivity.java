package com.example.menuprincipal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class VisorWebActivity extends AppCompatActivity {

    private WebView wvWeb;
    private Bundle bundle;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_web);

        wvWeb = (WebView)findViewById(R.id.wvWeb);
        bundle = getIntent().getExtras();
        url = bundle.getString("url");
        wvWeb.loadUrl(url);
    }
}
