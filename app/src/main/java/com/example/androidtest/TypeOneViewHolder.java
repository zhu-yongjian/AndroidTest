package com.example.androidtest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeOneViewHolder extends TypeAbstractViewHolder<problem> {

    public ImageView problem_touxiang;
    public TextView problem_renming;
    public TextView problem_time;
    public TextView problem_biaoti;
    public TextView problem_answer;
    public TextView answer_number;

    public TypeOneViewHolder(View itemView) {
        super(itemView);
        problem_touxiang = (ImageView)itemView.findViewById(R.id.problem_touxiang);
        problem_renming = (TextView)itemView.findViewById(R.id.problem_renming);
        problem_time = (TextView)itemView.findViewById(R.id.problem_time);
        problem_biaoti = (TextView)itemView.findViewById(R.id.problem_biaoti);
        problem_answer = (TextView)itemView.findViewById(R.id.problem_answer);
        answer_number = (TextView)itemView.findViewById(R.id.answer_number);
    }
    @Override
    public void bindHolder(problem model){
        problem_touxiang.setImageResource(model.problem_touxiang);
        problem_renming.setText(model.problem_renming);
        problem_time.setText(model.problem_time);
        problem_biaoti.setText(model.problem_biaoti);
        problem_answer.setText(model.problem_answer);
        answer_number.setText(model.answer_number);
    }
}
