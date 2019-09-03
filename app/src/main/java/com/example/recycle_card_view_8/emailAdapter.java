package com.example.recycle_card_view_8;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;

public class emailAdapter extends RecyclerView.Adapter<emailAdapter.ViewHolder>  {
    private List<Email> emailList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Sender, Title, Message;
        public TextClock Time;
        public ImageView sender_pic;

        public ViewHolder(View v) {
            super(v);
            Sender = (TextView) v.findViewById(R.id.Sender);
            Title = (TextView) v.findViewById(R.id.Title);
            Message = (TextView) v.findViewById(R.id.textinbox);
            Time = (TextClock) v.findViewById(R.id.time_receive);
            sender_pic = (ImageView) v.findViewById(R.id.img_mail);
        }
    }
    public  emailAdapter(List<Email> emailList){
        this.emailList = emailList;
    }
    @Override
    public  emailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewtype) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Email email = emailList.get(position);
        holder.Time.setText(String.valueOf(email.getTime()));
        holder.Sender.setText(email.getSender());
        holder.Title.setText(email.getTitle());
        holder.Message.setText(email.getMessage());
        holder.sender_pic.setImageResource(email.getPic());

        Log.d("CekADA",email.getSender());
    }
    @Override
    public int getItemCount() {
        return emailList.size();
    }
}

