package hs.daegun.dg_pr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
//pixlr
public class MainActivity extends AppCompatActivity {
public static final int Request_code_Intro=1;
public static final int Request_code_Inquiry=2;
public static final int Request_code_homepage=3;
public static final int Request_code_recruit=4;
public static final int Request_code_edu=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button_intro=findViewById(R.id.intro_button);
        button_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),intro_activity.class);
                startActivityForResult(intent,Request_code_Intro);

            }
        });

        ImageButton button_inquiry=findViewById(R.id.inquiry_button);
        button_inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),inquiry_activity.class);
                startActivityForResult(intent,Request_code_Inquiry);

            }
        });

        ImageButton button_homepage=findViewById(R.id.homepage_button);
        button_homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),homepage_activity.class);
                startActivityForResult(intent,Request_code_homepage);

            }
        });

        ImageButton button_recruit=findViewById(R.id.recruit_button);
        button_recruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),recruitment_activity.class);
                startActivityForResult(intent,Request_code_recruit);

            }
        });

        ImageButton button_edu=findViewById(R.id.edu_button);
        button_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),education_activity.class);
                startActivityForResult(intent,Request_code_edu);

            }
        });

    }
    public void click_intro(View v){
    Intent intent=new Intent(getApplication(),intro_activity.class);
    startActivity(intent);
    }

    public void click_inquiry(View v){
        Intent intent=new Intent(getApplication(),inquiry_activity.class);
        startActivity(intent);
    }

    public void click_homepage(View v){
        Intent intent=new Intent(getApplication(),homepage_activity.class);
        startActivity(intent);
    }

    public void click_recruit(View v){
        Intent intent=new Intent(getApplication(),recruitment_activity.class);
        startActivity(intent);
    }

    public void click_edu(View v){
        Intent intent=new Intent(getApplication(),education_activity.class);
        startActivity(intent);
    }
}
