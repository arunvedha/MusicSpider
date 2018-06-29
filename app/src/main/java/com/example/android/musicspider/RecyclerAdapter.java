package com.example.android.musicspider;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Track> tracks;

    public RecyclerAdapter(List<Track> tracks){
        this.tracks = tracks;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(tracks.get(position).getTrackName());
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;

        public MyViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.track_item);
        }
    }
}
