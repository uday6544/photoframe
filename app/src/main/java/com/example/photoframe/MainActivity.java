package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    TextView text;
    int currentImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pic=findViewById(R.id.pic);
        text=findViewById(R.id.textView);
        text.setText("Virat Kohli");
        text.setTextColor(getResources().getColor(R.color.black));
        pic.setImageResource(R.drawable.virat);
    }
    public void prev(View v){

        if(currentImage==0)
        {
            currentImage=3;
        }
        else{
            currentImage--;
        }

        pic=findViewById(R.id.pic);
        text=findViewById(R.id.textView);
        switch (currentImage){
            case 0:
                pic.setImageResource(R.drawable.virat);
                text.setText("Virat Kohli");
                return;
            case 1:
                pic.setImageResource(R.drawable.djokovic);
                text.setText("Novak Djokovic");
                return;
            case 2:
                pic.setImageResource(R.drawable.federer);
                text.setText("Roger Federer");
                return;
            case 3:
                pic.setImageResource(R.drawable.nadal);
                text.setText("Rafal Nadal");
                return;


        }




    }
    public void next(View v) {
        if (currentImage == 3) {
            currentImage = 0;
        } else {
            currentImage++;
        }
        pic = findViewById(R.id.pic);
        switch (currentImage) {
            case 0:
                pic.setImageResource(R.drawable.virat);
                text.setText("Virat Kohli");
                return;
            case 1:
                pic.setImageResource(R.drawable.djokovic);
                text.setText("Novak Djokovic");
                return;
            case 2:
                pic.setImageResource(R.drawable.federer);
                text.setText("Roger Federer");
                return;
            case 3:
                pic.setImageResource(R.drawable.nadal);
                text.setText("Rafal Nadal");
                return;
        }
    }


}