package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

     ImageButton bt1;
     ImageButton bt2;
     ImageButton bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final EditText text=(EditText)findViewById(R.id.recherche);
       bt1=(ImageButton)findViewById(R.id.imageButton7);
       bt2=(ImageButton)findViewById(R.id.imageButton8);
       bt3=(ImageButton)findViewById(R.id.imageButton9);

       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/search.html#q"+text.getText().toString()));
               startActivity(i);
           }
       });
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://fr.wikipedia.org/wiki/"+text.getText().toString()));
        startActivity(i);
    }
});
bt3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com/"));
        startActivity(i);
    }
});
    }
}