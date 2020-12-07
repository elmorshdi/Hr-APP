package com.elmorshdi.hr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    private final ArrayList<DatatEmployee> mydata;
    private final Context context;

    public MyCustomAdapter(ArrayList<DatatEmployee> mydata, Context context) {

        this.mydata = mydata;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.conectitem, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DatatEmployee employee = mydata.get(position);
        holder.card_name.setText(employee.getName());
        holder.card_title.setText(employee.getTittle());
        holder.card_phone.setText(employee.getPhone());
        holder.card_imag.setImageResource(employee.getCircleImage());
        holder.card_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(employee.getPhone()));
                context.startActivity(intent);
            }
        });
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("name", employee.getName());
                intent.putExtra("title", employee.getTittle());
                intent.putExtra("phone", employee.getPhone());
                intent.putExtra("img", employee.getCircleImage());

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    // inner class or nested class  (public or static )
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView card_imag;
        TextView card_name;
        TextView card_title;
        TextView card_phone;
        ImageButton card_btn;
        CardView cardView;

        public MyViewHolder(View itemview) {
            super(itemview);
            card_imag = itemview.findViewById(R.id.img);
            card_name = itemview.findViewById(R.id.name);
            card_title = itemview.findViewById(R.id.titel);
            card_phone = itemview.findViewById(R.id.number);
            card_btn = itemview.findViewById(R.id.call);
            cardView = itemview.findViewById(R.id.card);

        }

    }

    //


}
