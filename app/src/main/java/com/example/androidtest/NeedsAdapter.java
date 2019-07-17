package com.example.androidtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NeedsAdapter extends RecyclerView.Adapter<NeedsAdapter.ViewHolder> {
    private List<Needs> mNeedsList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView needs_biaoti;
        TextView needs_jiajie;
        TextView needs_jinfei;
        TextView needs_didian;
        TextView needs_time;

        public ViewHolder(View view)
        {
            super(view);
            needs_biaoti = (TextView) view.findViewById(R.id.needs_biaoti);
            needs_jiajie = (TextView) view.findViewById(R.id.needs_jiajie);
            needs_jinfei = (TextView) view.findViewById(R.id.needs_jinfei);
            needs_didian = (TextView) view.findViewById(R.id.needs_didian);
            needs_time = (TextView) view.findViewById(R.id.needs_time);
        }
    }

    public NeedsAdapter(List<Needs> needsList)
    {
        mNeedsList = needsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.needs,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Needs technology = mNeedsList.get(i);
        viewHolder.needs_biaoti.setText(technology.needs_biaoti);
        viewHolder.needs_jiajie.setText(technology.needs_jiajie);
        viewHolder.needs_jinfei.setText(technology.needs_jinfei);
        viewHolder.needs_didian.setText(technology.needs_didian);
        viewHolder.needs_time.setText(technology.needs_time);
    }

    @Override
    public int getItemCount() {
        return mNeedsList.size();
    }
}


