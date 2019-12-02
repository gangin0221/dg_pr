package hs.daegun.dg_pr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {

    public Adapter(Context context){
        this.context= context;
    }

    private int[] images={R.drawable.image1,R.drawable.image2,R.drawable.image3};
    private String[] text={"영화학교와 함께하는 AI 메이커 체험활동","데이터과학자 초청특강","대건학사 전경"};
    private LayoutInflater inflater;
    private Context context;

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v= inflater.inflate(R.layout.slider, container,false);
        ImageView imageview=(ImageView)v.findViewById(R.id.imageView);
        TextView textView=(TextView) v.findViewById((R.id.textView));
        imageview.setImageResource((images[position]));
        //textView.setText((position+1)+"번째 이미지입니다.");
        textView.setText(text[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.invalidate();
    }
}
