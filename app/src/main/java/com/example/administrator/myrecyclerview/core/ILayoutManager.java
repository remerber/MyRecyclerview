package com.example.administrator.myrecyclerview.core;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2017/2/21.
 */

public interface ILayoutManager {

    RecyclerView.LayoutManager getLayoutManager();

    int findLastVisiblePosition();
}
