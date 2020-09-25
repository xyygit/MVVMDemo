package com.demo.mvvm.base;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * @author yayun.xia.
 * @class BaseFragment.java
 * @explain
 * @create time 2020/9/25 19:12.
 */
public abstract class BaseFragment extends Fragment {
    protected Context mContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext = null;
    }
}
