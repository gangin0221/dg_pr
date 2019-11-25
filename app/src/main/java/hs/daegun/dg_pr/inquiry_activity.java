package hs.daegun.dg_pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class inquiry_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_activity);
    }

    public void onclicked1(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daegun.hs.kr/user/mobile/index.do"));
        startActivity(intent);
    }

    public void onclicked2(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-6764-0807"));
        startActivity(intent);
    }

    public void onclicked3(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://v4.map.naver.com/index.nhn?pinTitle=%EB%8C%80%EA%B1%B4%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90&pinType=site&pinId=11556843&mapMode=0"));
        startActivity(intent);
    }
}
