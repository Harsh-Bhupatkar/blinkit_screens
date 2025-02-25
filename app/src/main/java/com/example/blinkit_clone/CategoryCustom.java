package com.example.blinkit_clone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CategoryCustom extends LinearLayout {

    ImageView im1,im2,im3,im4;
    TextView tx1,tx2;
    public CategoryCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(R.layout.category_card,this,true);
        im1=findViewById(R.id.img1);
        im2=findViewById(R.id.img2);
        im3=findViewById(R.id.img3);
        im4=findViewById(R.id.img4);
        tx1=findViewById(R.id.count);
        tx2=findViewById(R.id.category);
    }

    public void setCategoryResource( int image1, int image2, int image3, int image4, String txt1, String txt2)
    {
        im1.setImageResource(image1);
        im2.setImageResource(image2);
        im3.setImageResource(image3);
        im4.setImageResource(image4);
        tx1.setText("+"+txt1+" more");
        tx2.setText(txt2);
    }
}
