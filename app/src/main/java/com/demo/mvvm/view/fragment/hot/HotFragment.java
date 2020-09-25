package com.demo.mvvm.view.fragment.hot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.FragmentHotBinding;

/**
 * 主界面 - 热卖Fragment
 */
public class HotFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHotBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hot, container, false);

        return binding.getRoot();
    }
}
