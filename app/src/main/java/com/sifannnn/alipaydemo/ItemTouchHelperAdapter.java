package com.sifannnn.alipaydemo;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by lishifan on 2022/8/20.
 */

public interface ItemTouchHelperAdapter {

    void onItemMove(RecyclerView.ViewHolder holder, int fromPosition, int targetPosition);

    void onItemSelect(RecyclerView.ViewHolder holder);

    void onItemClear(RecyclerView.ViewHolder holder);

    void onItemDismiss(RecyclerView.ViewHolder holder);
}
