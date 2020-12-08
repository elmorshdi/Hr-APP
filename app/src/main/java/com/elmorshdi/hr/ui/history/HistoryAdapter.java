package com.elmorshdi.hr.ui.history;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elmorshdi.hr.R;
import com.elmorshdi.hr.data.Reqest;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    private final Context context;
    private List<Reqest> mydata;

    public HistoryAdapter(List<Reqest> mydata, Context context) {

        this.mydata = mydata;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Reqest reqest = mydata.get(position);
        holder.date.setText(reqest.getStartday());
        holder.manger.setText(reqest.getManger());
        holder.reason.setText(reqest.getManger());
    }

    public Reqest getitemAt(int position) {
        return mydata.get(position);
    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    public void setData(List<Reqest> data) {
        this.mydata = data;
        notifyDataSetChanged();
    }

    //

    // inner class or nested class  (public or static )
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView manger;
        TextView reason;

        public MyViewHolder(View itemview) {
            super(itemview);
            date = itemview.findViewById(R.id.start);
            manger = itemview.findViewById(R.id.manger);
            reason = itemview.findViewById(R.id.reason);
        }

    }
}
