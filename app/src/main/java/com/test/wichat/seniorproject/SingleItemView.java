package com.test.wichat.seniorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends Activity {
    // Declare Variables

    String name;
    String photo;

    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.manage_user_item);

        Intent i = getIntent();
        // Get the result of rank
        name = i.getStringExtra("name");
        photo =i.getStringExtra("Pic");

        // Locate the TextViews in singleitemview.xml
        TextView txtname = (TextView) findViewById(R.id.txtName);


        // Locate the ImageView in singleitemview.xml
        ImageView photoPerson = (ImageView) findViewById(R.id.imagePerson);

        // Set results to the TextViews
        txtname.setText(name);

        // Capture position and set results to the ImageView
        // Passes flag images URL into ImageLoader.class
        imageLoader.DisplayImage(photo, photoPerson);
    }
}