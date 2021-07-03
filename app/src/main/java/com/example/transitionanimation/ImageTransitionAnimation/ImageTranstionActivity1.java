package com.example.transitionanimation.ImageTransitionAnimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.transitionanimation.R;

public class ImageTranstionActivity1 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_transtion1);



        imageView=findViewById(R.id.image1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ImageTranstionActivity1.this,ImageTransitionActivity2.class);

                Pair [] pairs=new Pair[1];
                pairs[0]=new Pair<View,String>(imageView,"img");


                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(ImageTranstionActivity1.this,pairs);

                startActivity(i,optionsCompat.toBundle());

            }
        });


    }
}