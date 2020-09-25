package com.demo.mvvm.view.fragment.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.FrgmentMineBinding;

/**
 * 主界面 - 我的Fragment
 */

public class MineFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FrgmentMineBinding binding = DataBindingUtil.inflate(inflater, R.layout.frgment_mine, container, false);

        return binding.getRoot();
    }
}
