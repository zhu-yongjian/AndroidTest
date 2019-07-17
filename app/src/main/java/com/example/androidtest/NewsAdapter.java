package com.example.androidtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private List<News> mNewsList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView news_imageView;
        TextView news_biaoti;
        TextView news_neirong;
        TextView news_time;

        public ViewHolder(View view)
        {
            super(view);
            news_imageView = (ImageView) view.findViewById(R.id.news_imageView);
            news_biaoti = (TextView) view.findViewById(R.id.news_biaoti);
            news_neirong = (TextView) view.findViewById(R.id.news_neirong);
            news_time = (TextView) view.findViewById(R.id.news_time);
        }
    }

        public NewsAdapter(List<News> newsList)
    {
         mNewsList = newsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        News follow = mNewsList.get(i);
        viewHolder.news_imageView.setImageResource(follow.news_imageView);
        viewHolder.news_biaoti.setText(follow.news_biaoti);
        viewHolder.news_neirong.setText(follow.news_neirong);
        viewHolder.news_time.setText(follow.news_time);
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }
}

