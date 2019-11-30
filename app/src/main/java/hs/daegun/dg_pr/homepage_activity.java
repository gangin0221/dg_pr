package hs.daegun.dg_pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class homepage_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_activity);
    }

    public void onclicked1(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daegun.hs.kr/user/mobile/index.do"));
        startActivity(intent);
    }
}
