package com.community.realtime.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.community.realtime.R;
import com.community.realtime.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}