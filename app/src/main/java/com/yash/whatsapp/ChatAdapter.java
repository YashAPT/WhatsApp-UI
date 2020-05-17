package com.yash.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private int mNumberOfItems;
    public ChatAdapter(int numberOfItems){
        super();
        mNumberOfItems = numberOfItems;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.circularImageView.setImageResource(R.drawable.aj);
        holder.name.setText("Yash");
        holder.tick.setImageResource(R.drawable.check);
        holder.lastMssg.setText("Last Message");
        holder.time.setText("5:40 pm");
    }

    @Override
    public int getItemCount() {
        return mNumberOfItems;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView circularImageView;
        TextView name;
        TextView time;
        ImageView tick;
        TextView lastMssg;

        public MyViewHolder(View itemView) {
            super(itemView);
            circularImageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            tick = itemView.findViewById(R.id.tick);
            lastMssg = itemView.findViewById(R.id.lastMssg);
        }

    }
}
