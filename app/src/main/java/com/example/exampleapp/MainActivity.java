package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean barIsShowing=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fade(View view)
    {
        Log.i("Info","ImageView tapped ");
        ImageView bartImageView=findViewById(R.id.bartImageView);
        ImageView homerImageView=findViewById(R.id.homerImageView);
//        Let's use some other Animations
        //Rotation is another type of animation
//        it basically rotates the image rotation takes the value in degree like 90 degree 180 degree 360 etc
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //Translation here basically means move in mathmatical term
        //translationXBy will move the picture in x direction by a certain number of dp
       // bartImageView.animate().translationX(1000).setDuration(2000);//to right if we  use -1000 in translation(-1000)
//  alpha is used to set the opacity
//opacity basically means how solid a picture would be
// bartImageView.animate().alpha(0).setDuration(2000);
//homerImageView.animate().alpha(1).setDuration(2000);
//Use if else condition--

    }
}