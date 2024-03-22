package com.example.mirea_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class ActivityConstraint extends AppCompatActivity {

    /*private ActivityConstraintBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConstraintBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("tate").toString();

        binding.resultText.setText(name);

        binding.buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("HEISEN", "hello");
                Intent result = new Intent();
                String resultValue = binding.editText.getText().toString();
                result.putExtra("right?", resultValue);
                setResult(Activity.RESULT_OK, result);
                finish();
            }
        });
    }*/
}