package com.example.androidtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder> {
    private List<Follow> mFollowList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;

        public ViewHolder(View view)
        {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.touxiang);
            textView1 = (TextView) view.findViewById(R.id.renming);
            textView2 = (TextView) view.findViewById(R.id.time);
            textView3 = (TextView) view.findViewById(R.id.biaoti);
            textView4 = (TextView) view.findViewById(R.id.neirong);
            textView5 = (TextView) view.findViewById(R.id.zan_number);
            textView6 = (TextView) view.findViewById(R.id.pinlun_number);
        }
    }

    public FollowAdapter(List<Follow> followList)
    {
        mFollowList = followList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.follow_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Follow follow = mFollowList.get(i);
        viewHolder.imageView.setImageResource(follow.touxiang);
        viewHolder.textView1.setText(follow.renming);
        viewHolder.textView2.setText(follow.time);
        viewHolder.textView3.setText(follow.biaoti);
        viewHolder.textView4.setText(follow.neirong);
        viewHolder.textView5.setText(follow.zan_number);
        viewHolder.textView6.setText(follow.pinlun_number);
    }

    @Override
    public int getItemCount() {
        return mFollowList.size();
    }
}
