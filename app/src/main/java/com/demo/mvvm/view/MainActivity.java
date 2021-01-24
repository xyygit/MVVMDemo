package com.demo.mvvm.view;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentPagerAdapter;

import com.demo.mvvm.R;
import com.demo.mvvm.adpter.MainTabAdapter;
import com.demo.mvvm.base.BaseActivity;
import com.demo.mvvm.databinding.ActivityMainBinding;

/**
 * @author yayun.xia.
 * @class MainActivity.java
 * @explain 首页
 * @create time 2020/9/25 16:08.
 */
public class MainActivity extends BaseActivity {
    private ActivityMainBinding binding;
    private FragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过DataBing来绑定布局视图
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //初始化适配器-添加所需要的fragment
        mAdapter = new MainTabAdapter(this);
        binding.vpMain.setAdapter(mAdapter);

        //将TabLayout和ViewPager关联起来
        binding.tbBottomMain.setupWithViewPager(binding.vpMain);
        binding.vpMain.setOffscreenPageLimit(5);

        initTab();
    }

    /**
     * 设置添加Tab
     */
    private void initTab() {
        /**
         *  tab_home为底部导航条布局
         */
        binding.tbBottomMain.getTabAt(0).setCustomView(R.layout.tab_home);
        binding.tbBottomMain.getTabAt(1).setCustomView(R.layout.tab_hot);
        binding.tbBottomMain.getTabAt(2).setCustomView(R.layout.tab_category);
        binding.tbBottomMain.getTabAt(3).setCustomView(R.layout.tab_cart);
        binding.tbBottomMain.getTabAt(4).setCustomView(R.layout.tab_mine);

        //默认选中的Tab
        binding.tbBottomMain.getTabAt(0).getCustomView().setSelected(true);

        //this is dev1 commit

    }
}