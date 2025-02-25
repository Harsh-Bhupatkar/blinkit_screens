package com.example.blinkit_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.styleBack));

        relatedProducts r1=findViewById(R.id.rpro1);
        r1.setResources(R.drawable.pepsi2l,"Pepsi Soft Drink\n(2.25l)","43060","9","91");

        relatedProducts r2=findViewById(R.id.rpro2);
        r2.setResources(R.drawable.thumpsup2l,"Thums Up Soft\nDrink (2.25l)","6491","5","95");

        relatedProducts r3=findViewById(R.id.rpro3);
        r3.setResources(R.drawable.cola2l,"Coca-Cola Soft\nDrink(2.25l)","3163","4","96");





        ImageView img=findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(product.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}