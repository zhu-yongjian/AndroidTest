package com.example.androidtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TechnologyAdapter extends RecyclerView.Adapter<TechnologyAdapter.ViewHolder> {
    private List<Technology> mTechnologyList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView technology_imageView;
        TextView technology_biaoti;
        TextView technology_neirong;
        TextView technology_country;
        TextView technology_stage;

        public ViewHolder(View view)
        {
            super(view);
            technology_imageView = (ImageView) view.findViewById(R.id.technology_imageView);
            technology_biaoti = (TextView) view.findViewById(R.id.technology_biaoti);
            technology_neirong = (TextView) view.findViewById(R.id.technology_neirong);
            technology_country = (TextView) view.findViewById(R.id.technology_country);
            technology_stage = (TextView) view.findViewById(R.id.technology_stage);
        }
    }

    public TechnologyAdapter(List<Technology> technologyList)
    {
        mTechnologyList = technologyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.technology,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Technology technology = mTechnologyList.get(i);
        viewHolder.technology_imageView.setImageResource(technology.technology_imageView);
        viewHolder.technology_biaoti.setText(technology.technology_biaoti);
        viewHolder.technology_neirong.setText(technology.technology_neirong);
        viewHolder.technology_country.setText(technology.technology_country);
        viewHolder.technology_stage.setText(technology.technology_stage);
    }

    @Override
    public int getItemCount() {
        return mTechnologyList.size();
    }
}

