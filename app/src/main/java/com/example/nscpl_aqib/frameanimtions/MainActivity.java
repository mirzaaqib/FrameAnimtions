package com.example.nscpl_aqib.frameanimtions;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView view;
    Button b1,b2;
    private AnimationDrawable frameAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view= (ImageView) findViewById(R.id.imageView);
        //type casting the image view
        view.setBackgroundResource(R.drawable.frame_animation_list);
        frameAnimation= (AnimationDrawable) view.getBackground();
        onClick(view);

        //set true if you want to animate once
//        frameAnimation.setOneShot(true);
//        b1= (Button) findViewById(R.id.start);
//        b1.setOnClickListener((View.OnClickListener) this);
//        b2= (Button) findViewById(R.id.stop);
//        b2.setOnClickListener((View.OnClickListener) this);
         findViewById(R.id.start11).setOnClickListener((View.OnClickListener) this);
         findViewById(R.id.stop22).setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view){
        int id=view.getId();
        if(id==R.id.start11){
            frameAnimation.start();
        }else if(id==R.id.stop22){
            frameAnimation.stop();

        }
    }
}
