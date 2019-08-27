package com.example.john.tab2layout;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<FoodCart> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView cv;
        TextView textView;
        TextView textView2;
        ImageView imageView;
       // public TextView textView2;
        public MyViewHolder(CardView v) {
            super(v);
            cv = v;
             textView = (TextView) itemView.findViewById(R.id.comment);
             textView2 = (TextView) itemView.findViewById(R.id.textView);
            imageView = (ImageView) itemView.findViewById(R.id.img);

        }


    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<FoodCart> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset.get(position).getName());
        holder.textView2.setText(mDataset.get(position).getLocation());
        //holder.imageView.setImageResource(mDataset.get(position).getImage());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void clear() {
        mDataset.clear();
        notifyDataSetChanged();
    }

    // Add a list of items -- change to type used
    public void addAll(List<FoodCart> list) {
        mDataset.addAll(list);
        notifyDataSetChanged();
    }

}
