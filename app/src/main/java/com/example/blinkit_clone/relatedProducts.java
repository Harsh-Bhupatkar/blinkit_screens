package com.example.blinkit_clone;

import android.content.Context;
import android.graphics.Paint;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class relatedProducts extends LinearLayout {

    ImageView prod_img;

    TextView prod_name,prod_ratings,prod_dis,prod_price;

    public relatedProducts(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(R.layout.related_products,this,true);
        prod_img=findViewById(R.id.product_image);
        prod_name=findViewById(R.id.product_name);
        prod_ratings=findViewById(R.id.product_rating);
        prod_dis=findViewById(R.id.product_discount);
        prod_price=findViewById(R.id.product_price);
        TextView textView = findViewById(R.id.textStrike);  // Get the current paint flags (styles) applied to the TextView
        textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);// Add the STRIKE_THRU_TEXT_FLAG to the current paint flags to apply a strikethrough effect

    }

    public void setResources(int img, String name,String rating,String dis, String price)
    {
        prod_img.setImageResource(img);
        prod_name.setText(name);
        prod_ratings.setText("("+rating+")");
        prod_dis.setText(dis+"% OFF");
        prod_price.setText("₹"+price);
    }
}
