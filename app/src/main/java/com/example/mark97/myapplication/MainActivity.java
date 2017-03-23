package com.example.mark97.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class
MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("HEADING","STARTED LEARNING ANDROID");
        Log.d("msg", "The onCreate() event");
    }
     protected void onStart()
     {
         super.onStart();
         Log.i("HEADING","STARTED LEARNING ANDROID");
         Log.d("msg", "The onStart() event");

     }
     protected void onResume()
     {
         super.onResume();
         Log.v("THIS IS TAG","HELLO ANDROID");
         Log.d("msg", "The onResume() event");
     }
     protected void onPause()
     {
         super.onPause();
         Log.d("msg", "The onPause() event");
     }
     protected void onStop()
     {

         super.onStop();
         Log.d("msg", "The onStop() event");
     }
     protected void onDestroy()
     {

         super.onDestroy();
         Log.d("msg", "The onDestroy() event");

     }
}
