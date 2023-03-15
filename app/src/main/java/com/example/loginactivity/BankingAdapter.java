package com.example.loginactivity;
//https://droidbyme.medium.com/android-recyclerview-with-multiple-view-type-multiple-view-holder-af798458763b
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BankingAdapter extends RecyclerView.Adapter<BankingAdapter.ViewHolder>
{
    private final ArrayList<BankItemData> bankServicesList;

    public BankingAdapter(ArrayList<BankItemData> bankServicesList)
    {
        this.bankServicesList = bankServicesList;
    }
    /**
     * Create the View Holder object,
     * @param parent viewgroup where the views are hosted
     * @param viewType if recylcer view will show more than multiple view holders with different xml
     * @return returns a View holder object created by infalting the item layout
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    /**
     * This method give the recycler view the values to render on the screen
     * @param holder View holder object that contains the widgets Imageview /text view
     * @param position int variable that changes as user scrolls up
     *                / down this position is use to select the data to display from the list data.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        // get data from list at position
        BankItemData currentData =bankServicesList.get(position);
        // set the image icon to what is in the list
        holder.bankingIcon.setImageResource(currentData.getImageIcon());
        // set the text to the text that is in the list.
        holder.bankServiceTextView.setText(currentData.getName());
    }

    @Override
    public int getItemCount()
    {
        return bankServicesList.size() ;
    }
    // we need this class to initialize the view object(s) that are displayed by the recycler view
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView bankingIcon;
        TextView bankServiceTextView;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            bankingIcon = itemView.findViewById(R.id.serviceImageViewIcon);
            bankServiceTextView = itemView.findViewById(R.id.serviceTextViewName);
        }
    }
}
