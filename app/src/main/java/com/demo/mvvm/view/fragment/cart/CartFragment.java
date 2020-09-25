package com.demo.mvvm.view.fragment.cart;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.demo.mvvm.R;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.FragmentCartBinding;


/**
 * 主界面 - 购物车Fragment
 */

public class CartFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCartBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false);
        return binding.getRoot();
    }
}
