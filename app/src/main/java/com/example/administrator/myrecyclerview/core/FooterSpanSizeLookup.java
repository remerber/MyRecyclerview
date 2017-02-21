package com.example.administrator.myrecyclerview.core;

import android.support.v7.widget.GridLayoutManager;

/**
 * Created by Administrator on 2017/2/21.
 */

public class FooterSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
    private BaseListActivity.BaseListAdapter adapter;
    private int spanCount;

    public FooterSpanSizeLookup(BaseListActivity.BaseListAdapter adapter, int spanCount) {
        this.adapter = adapter;
        this.spanCount = spanCount;
    }

    @Override
    public int getSpanSize(int position) {
        if (adapter.isFooterView(position)) {
            return spanCount;
        }
        return 1;
    }
}
