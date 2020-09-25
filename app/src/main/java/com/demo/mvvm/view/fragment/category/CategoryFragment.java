package com.demo.mvvm.view.fragment.category;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.FragmentCategoryBinding;


/**
 * 主界面 - 分类Fragment
 */
public class CategoryFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCategoryBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_category, container, false);

        return binding.getRoot();
    }
}
