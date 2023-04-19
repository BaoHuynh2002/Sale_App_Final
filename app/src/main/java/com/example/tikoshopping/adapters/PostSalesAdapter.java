package com.example.tikoshopping.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tikoshopping.R;
import com.example.tikoshopping.models.PostSales;
import com.example.tikoshopping.models.TypeGoods;

import java.util.List;

public class PostSalesAdapter extends RecyclerView.Adapter<PostSalesAdapter.ViewHolder> {
    private List<PostSales> mData = null;

    public PostSalesAdapter(List<PostSales> data) {
        mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_typegoods, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PostSales item = mData.get(position);
        holder.mTitleView.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitleView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTitleView = itemView.findViewById(R.id.name_product);
        }
    }
}