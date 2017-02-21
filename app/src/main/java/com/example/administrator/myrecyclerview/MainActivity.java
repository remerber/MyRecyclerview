package com.example.administrator.myrecyclerview;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.administrator.myrecyclerview.core.BaseListActivity;
import com.example.administrator.myrecyclerview.core.BaseViewHolder;

import java.util.ArrayList;


public class MainActivity extends BaseListActivity<String> implements SwipeRefreshLayout.OnRefreshListener {


    @Override
    protected void setUpView() {
        super.setUpView();
    }

    @Override
    protected void setUpData(Bundle savedInstanceState) {
        super.setUpData(savedInstanceState);
        setRefreshing();
    }


    @Override
    protected BaseViewHolder getViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sample_list_item, parent, false);
        return new SampleViewHolder(view);
    }

    @Override
    public void onRefresh() {
        mDataList = new ArrayList<>();
        mDataList.clear();
        for (int i = 0; i < 50; i++) {
            mDataList.add("list item is" + i);
        }

        adapter.notifyDataSetChanged();
        mSwipeRefreshLayout.setRefreshing(false);

    }


    class SampleViewHolder extends BaseViewHolder {
        TextView mSampleListItemLabel;

        public SampleViewHolder(View itemView) {
            super(itemView);
            mSampleListItemLabel = (TextView) itemView.findViewById(R.id.mSampleListItemLabel);
        }

        @Override
        public void onBindViewHolder(int position) {
            mSampleListItemLabel.setText(mDataList.get(position));
        }

    }
}
