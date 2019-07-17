package com.example.androidtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InterlocutionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;

    private LayoutInflater mLayoutInflater;

    public InterlocutionAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    private ArrayList<problem> list1;
    private ArrayList<payment> list2;
    private ArrayList<Integer> types = new ArrayList<>();
    private Map<Integer,Integer> mPosition = new HashMap<>();

    public void addList(ArrayList<problem> list1,ArrayList<payment> list2){
        addListByType(TYPE_ONE,list1);
        addListByType(TYPE_TWO,list2);

        this.list1 = list1;
        this.list2 = list2;
    }

    private void addListByType(int type,ArrayList list){
        mPosition.put(type,types.size());
        for (int i = 0; i < list.size(); i++) {
            types.add(type);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case TYPE_ONE:
                return new TypeOneViewHolder(mLayoutInflater.inflate(R.layout.answer_item,parent,false));
            case TYPE_TWO:
                return new TypeTwoViewHolder(mLayoutInflater.inflate(R.layout.payment_problem,parent,false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        int realPosition = position -mPosition.get(viewType);
        switch (viewType){
            case TYPE_ONE:
                ((TypeOneViewHolder)holder).bindHolder(list1.get(realPosition));
                break;
            case TYPE_TWO:
                ((TypeTwoViewHolder)holder).bindHolder(list2.get(realPosition));
                break;
        }
    }
    @Override
    public int getItemViewType(int position) {
        //得到不同的布局类型
        return types.get(position);
    }

    @Override
    public int getItemCount() {
        return types.size();
    }
}
