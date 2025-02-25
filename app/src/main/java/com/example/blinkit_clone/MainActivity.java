package com.example.blinkit_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView micro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Window window = getWindow();    // Get the current Window object associated with the activity
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);  // Clear the flag that makes the status bar translucent
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);  // Add the flag that allows the app to draw system bar backgrounds
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.back));    // Set the status bar color to the color defined in R.color.back
       // micro=findViewById(R.id.allImage);


        //Objects of horizontal categories

        Horizontal_categoryu h1 = findViewById(R.id.horizontal1);
        h1.setResources(R.drawable.all,"All");

        Horizontal_categoryu h2 = findViewById(R.id.horizontal2);
        h2.setResources(R.drawable.wedding,"Wedding");

        Horizontal_categoryu h3 = findViewById(R.id.horizontal3);
        h3.setResources(R.drawable.electronics,"Electronic");

        Horizontal_categoryu h4 = findViewById(R.id.horizontal4);
        h4.setResources(R.drawable.beauty,"Beauty");

        Horizontal_categoryu h5 = findViewById(R.id.horizontal5);
        h5.setResources(R.drawable.kids,"Kids");

        Horizontal_categoryu h6 = findViewById(R.id.horizontal6);
        h6.setResources(R.drawable.gift,"Gift");

        //Objects of Categories
        CategoryCustom category1=findViewById(R.id.cat1);
        category1.setCategoryResource(R.drawable.potato,R.drawable.tomato,R.drawable.onion,R.drawable.lemon,"103","Vegetable\n& Fruits");

        CategoryCustom category2=findViewById(R.id.cat2);
        category2.setCategoryResource(R.drawable.milk2,R.drawable.milk1,R.drawable.milk2,R.drawable.milk1,"6","Dairy,Bread\n& Eggs");

        CategoryCustom category3=findViewById(R.id.cat3);
        category3.setCategoryResource(R.drawable.cooking_oil,R.drawable.cooking_oil2,R.drawable.cooking_oil,R.drawable.cooking_oil2,"247","Oil,Ghee\n& Cheese");

        CategoryCustom category4=findViewById(R.id.cat4);
        category4.setCategoryResource(R.drawable.chips,R.drawable.chips2,R.drawable.chips,R.drawable.chips2,"226","Chips\n& Namkeen");

        CategoryCustom category5=findViewById(R.id.cat5);
        category5.setCategoryResource(R.drawable.bis1,R.drawable.bis2,R.drawable.bis1,R.drawable.bis2,"119","Bakery\n& Biscuits");

        CategoryCustom category6=findViewById(R.id.cat6);
        category6.setCategoryResource(R.drawable.atta,R.drawable.rice,R.drawable.atta,R.drawable.rice,"19","Atta,Rice\n& Dal");



        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, product.class);
                startActivity(i);
            }
        });
    }
}