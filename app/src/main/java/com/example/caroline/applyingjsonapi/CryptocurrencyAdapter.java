package com.example.caroline.applyingjsonapi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by princ on 12/02/2018.
 */

public class CryptocurrencyAdapter extends RecyclerView.Adapter<CryptocurrencyAdapter.MyViewHolder> {

    private Context context;
    private List<Cryptocurrency> cryptocurrencyList;

    public CryptocurrencyAdapter(Context context, List<Cryptocurrency> cryptocurrencyList){
        this.context = context;
        this.cryptocurrencyList = cryptocurrencyList;
    }

    @Override
    public CryptocurrencyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cryptocurrency_info, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(CryptocurrencyAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

    }
}
