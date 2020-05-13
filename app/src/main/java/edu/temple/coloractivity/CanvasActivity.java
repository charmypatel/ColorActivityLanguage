package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;


public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        String currentLanguage = Locale.getDefault().getLanguage();

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        final View selectedColor;
        selectedColor = this.getWindow().getDecorView();

        TextView colorText;
        colorText = findViewById(R.id.colorText);

        //sets the title of activity
        getSupportActionBar().setTitle("Canvas Activity");


        //position is getting each item in the array in the spinner
        //set.Text displays the color name once a color is clicked on in the spinner


        if (currentLanguage.equals("es")) {
            if (position == 1) {
                selectedColor.setBackgroundResource(R.color.Red);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 2) {
                selectedColor.setBackgroundResource(R.color.Orange);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 3) {
                selectedColor.setBackgroundResource(R.color.Yellow);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 4) {
                selectedColor.setBackgroundResource(R.color.Green);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 5) {
                selectedColor.setBackgroundResource(R.color.Lime);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 6) {
                selectedColor.setBackgroundResource(R.color.Blue);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 7) {
                selectedColor.setBackgroundResource(R.color.Purple);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 8) {
                selectedColor.setBackgroundResource(R.color.Cyan);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 9) {
                selectedColor.setBackgroundResource(R.color.Navy);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 10) {
                selectedColor.setBackgroundResource(R.color.Grey);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);
            }

            }else{

            if (position == 1) {
                selectedColor.setBackgroundResource(R.color.Red);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 2) {
                selectedColor.setBackgroundResource(R.color.Orange);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 3) {
                selectedColor.setBackgroundResource(R.color.Yellow);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 4) {
                selectedColor.setBackgroundResource(R.color.Green);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 5) {
                selectedColor.setBackgroundResource(R.color.Lime);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 6) {
                selectedColor.setBackgroundResource(R.color.Blue);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 7) {
                selectedColor.setBackgroundResource(R.color.Purple);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 8) {
                selectedColor.setBackgroundResource(R.color.Cyan);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 9) {
                selectedColor.setBackgroundResource(R.color.Navy);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);

            } else if (position == 10) {
                selectedColor.setBackgroundResource(R.color.Grey);
                String retrieve[] = getResources().getStringArray(R.array.Colors);
                String color = retrieve[position];
                colorText.setText(color);
            }


        }
    }

    }


