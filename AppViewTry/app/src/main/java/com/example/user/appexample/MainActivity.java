package com.example.user.appexample;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast; 

import android.content.Context;
import android.os.Build;

import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {
	private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		context=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	private void onClicks(View view){
		Toast.makeText(context, "On click.", Toast.LENGTH_SHORT).show();
	}
}