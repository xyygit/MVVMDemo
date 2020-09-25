package com.demo.mvvm.adpter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.demo.mvvm.view.MainActivity;
import com.demo.mvvm.view.fragment.cart.CartFragment;
import com.demo.mvvm.view.fragment.category.CategoryFragment;
import com.demo.mvvm.view.fragment.home.HomeFragment;
import com.demo.mvvm.view.fragment.hot.HotFragment;
import com.demo.mvvm.view.fragment.mine.MineFragment;

/**
 * 适配器
 */
public class MainTabAdapter extends FragmentPagerAdapter {

    private MainActivity mContext;

    private HomeFragment homeFragment;
    private HotFragment hotFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private MineFragment mineFragment;

    public MainTabAdapter(MainActivity mainActivity) {
        super(mainActivity.getSupportFragmentManager());
        this.mContext = mainActivity;

        //初始化Fragment
        homeFragment = new HomeFragment();
        hotFragment = new HotFragment();
        categoryFragment = new CategoryFragment();
        cartFragment = new CartFragment();
        mineFragment = new MineFragment();
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return homeFragment;
        } else if (position == 1) {
            return hotFragment;
        } else if (position == 2) {
            return categoryFragment;
        } else if (position == 3) {
            return cartFragment;
        } else if (position == 4) {
            return mineFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
