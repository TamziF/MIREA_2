package com.example.mirea_2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.mirea_2.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.first_container, FragmentLinear.class, null)
                .commit();

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.second_container, FragmentConstraint.class, null)
                .commit();*/

    }

    public void onClickClack(View view) {
        Intent intent = new Intent(this, ActivityConstraint.class);
        intent.putExtra("kuku", "Это декларация");
        startActivity(intent);
    }
}