package com.example.androidtest;

public class payment {
    public int payment_touxiang;

    public String payment_renming;
    public String payment_time;
    public String payment_neirong;
    public String payment_answer;
    public String payment_type;

    public payment(int imageView,String textView1,String textView2,String textView3
            ,String textView4,String textView5){
        payment_touxiang = imageView;
        payment_renming = textView1;
        payment_time = textView2;
        payment_neirong = textView3;
        payment_answer = textView4;
        payment_type = textView5;
    }
}
