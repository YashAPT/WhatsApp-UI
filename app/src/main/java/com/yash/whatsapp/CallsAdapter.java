package com.yash.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.MyViewHolder> {

    private int mNumberOfItems;
    public CallsAdapter(int numberOfItems){
        super();
        mNumberOfItems = numberOfItems;
    }



    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_list, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.image.setImageResource(R.drawable.myimage);
        holder.phone.setImageResource(R.drawable.phone);
        holder.in.setImageResource(R.drawable.in_call);
        holder.name.setText("SomeOne");
        holder.time.setText("10 May, 5:40 pm");
    }

    @Override
    public int getItemCount() {
        return mNumberOfItems;
    }


    public  class  MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView image;
        ImageView phone;
        ImageView in;
        TextView name;
        TextView time;



        public MyViewHolder(View itemView){

            super(itemView);
            image = itemView.findViewById(R.id.image);
            phone = itemView.findViewById(R.id.phone);
            in = itemView.findViewById(R.id.tick);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);

        }


    }
}
