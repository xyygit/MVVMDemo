package com.demo.mvvm.view.fragment.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.demo.mvvm.R;
import com.demo.mvvm.adpter.TopAdapter;
import com.demo.mvvm.base.BaseFragment;
import com.demo.mvvm.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 主界面 - 首页Fragment
 */
public class HomeFragment extends BaseFragment {
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mFragment;
    private List<String> mTitle;
    private FragmentHomeBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        initTabFragment();
        return mBinding.getRoot();
    }

    private void initTabFragment() {

        //初始化Fragment
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();

        //将Fragment装进列表中
        mFragment = new ArrayList<>();
        mFragment.add(fragment1);
        mFragment.add(fragment2);
        mFragment.add(fragment3);

        //将名称添加daoTab列表
        mTitle = new ArrayList<>();
        mTitle.add("Tab1");
        mTitle.add("Tab2");
        mTitle.add("Tab3");

        //为TabLayout添加Tab名称
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(0)));
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(1)));
        mBinding.topTabLayout.addTab(mBinding.topTabLayout.newTab().setText(mTitle.get(2)));


        mAdapter = new TopAdapter(getActivity().getSupportFragmentManager(), mFragment, mTitle);

        //ViewPager加载Adapter
        mBinding.topViewPager.setAdapter(mAdapter);

        //TabLayout加载ViewPager
        mBinding.topTabLayout.setupWithViewPager(mBinding.topViewPager);
    }
}
