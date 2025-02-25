package com.example.blinkit_clone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class Horizontal_categoryu extends LinearLayout {

    ImageView img;
    TextView txt;
    public Horizontal_categoryu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(R.layout.horizontal_category,this, true);
        img=findViewById(R.id.allImage);
        txt=findViewById(R.id.text1);
    }

    public void setResources(int image, String text)
    {
        img.setImageResource(image);
        txt.setText(text);
    }
}
