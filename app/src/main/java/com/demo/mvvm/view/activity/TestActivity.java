package com.demo.mvvm.view.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseActivity;

public class TestActivity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
