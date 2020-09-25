package com.demo.mvvm.view.fragment.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.Fragment3Binding;

public class Fragment3 extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fragment3Binding binding = DataBindingUtil.inflate(inflater, R.layout.fragment3, container, false);

        return binding.getRoot();
    }
}
