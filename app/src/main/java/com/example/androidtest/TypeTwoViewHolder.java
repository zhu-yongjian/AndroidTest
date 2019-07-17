package com.example.androidtest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeTwoViewHolder extends TypeAbstractViewHolder<payment> {

    public ImageView payment_touxiang;
    public TextView payment_renming;
    public TextView payment_time;
    public TextView payment_neirong;
    public TextView payment_answer;
    public TextView payment_type;

    public TypeTwoViewHolder(View itemView) {
        super(itemView);
        payment_touxiang = (ImageView)itemView.findViewById(R.id.payment_touxiang);
        payment_renming = (TextView)itemView.findViewById(R.id.payment_renming);
        payment_time = (TextView)itemView.findViewById(R.id.payment_time);
        payment_neirong = (TextView)itemView.findViewById(R.id.payment_neirong);
        payment_answer = (TextView)itemView.findViewById(R.id.payment_answer);
        payment_type = (TextView)itemView.findViewById(R.id.payment_type);
    }
    @Override
    public void bindHolder(payment model){
        payment_touxiang.setImageResource(model.payment_touxiang);
        payment_renming.setText(model.payment_renming);
        payment_time.setText(model.payment_time);
        payment_neirong.setText(model.payment_neirong);
        payment_answer.setText(model.payment_answer);
        payment_type.setText(model.payment_type);
    }
}
