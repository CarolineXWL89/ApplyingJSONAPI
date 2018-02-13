package com.example.caroline.applyingjsonapi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cryptocurrency_info, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CryptocurrencyAdapter.MyViewHolder holder, int position) {
        Cryptocurrency cryptocurrency = cryptocurrencyList.get(position);
        holder.currencyName.setText(cryptocurrency.getCurrencyName());
        holder.id.setText(cryptocurrency.getId());
        holder.symbol.setText(cryptocurrency.getSymbol());
        holder.rank.setText("" + cryptocurrency.getRank());
        holder.priceUsd.setText("" + cryptocurrency.getPriceUsd());
        holder.priceBtc.setText("" + cryptocurrency.getPriceBtc());
        holder.VolumeUsd24.setText("" + cryptocurrency.getVolumeUsd24());
        holder.marketCapUsd.setText("" + cryptocurrency.getMarketCapUsd());
        holder.availableSupply.setText("" + cryptocurrency.getAvailableSupply());
        holder.totalSupply.setText("" + cryptocurrency.getTotalSupply());
        holder.maxSupply.setText("" + cryptocurrency.getMaxSupply());
        holder.percentChange1H.setText("" + cryptocurrency.getPercentChange1h());
        holder.percentChange24H.setText("" + cryptocurrency.getPercentChange24h());
        holder.percentChange7D.setText("" + cryptocurrency.getPercentChange7d());
        holder.lastUpdated.setText("" + cryptocurrency.getLastUpdated());
        holder.priceEur.setText("" + cryptocurrency.getPriceEur());
        holder.volumeEur24H.setText("" + cryptocurrency.getVolumeEur24h());
        holder.marketCapEur.setText("" + cryptocurrency.getMarketCapEur());
        /**
         * this.id = "bitcoin";
         this.currencyName = "Bitcoin";
         this.symbol = "BTC";
         this.rank = 1;
         this.price_usd = 11162.2;
         this.price_btc = 1.0;
         this.volume_usd_24 = 10427200000.0;
         this.market_cap_usd = 187770383291.0;
         this.available_supply = 16821987.0;
         this.total_supply = 16821987.0;
         this.max_supply = 21000000.0;
         this.percent_change1h = 0.37;
         this.percent_change24h = 6.26;
         this.percent_change_7d = -2.46;
         this.last_updated = 1516740865;
         this.price_eur = 9092.4602272;
         this.volume_eur_24h = 8493746867.2;
         this.market_cap_eur = 152953247740.0;
         */


    }

    @Override
    public int getItemCount() {
        return cryptocurrencyList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView currencyName, id, symbol, rank, priceUsd, priceBtc, VolumeUsd24, marketCapUsd, availableSupply;
        private TextView totalSupply, maxSupply, percentChange1H, percentChange24H, percentChange7D, lastUpdated;
        private TextView priceEur, volumeEur24H, marketCapEur;

        public MyViewHolder(View itemView){
            super(itemView);
            currencyName = itemView.findViewById(R.id.currency_name_text);
            id = itemView.findViewById(R.id.id_text);
            symbol = itemView.findViewById(R.id.symbol_text);
            rank = itemView.findViewById(R.id.rank_text);
            priceUsd = itemView.findViewById(R.id.price_usd_text);
            priceBtc = itemView.findViewById(R.id.price_btc_text);
            VolumeUsd24 = itemView.findViewById(R.id.volume_usd_24_text);
            marketCapUsd = itemView.findViewById(R.id.market_cap_usd_text);
            availableSupply = itemView.findViewById(R.id.available_supply_text);
            totalSupply = itemView.findViewById(R.id.total_supply_text);
            maxSupply = itemView.findViewById(R.id.max_supply_text);
            percentChange1H = itemView.findViewById(R.id.percent_change_1h_text);
            percentChange24H = itemView.findViewById(R.id.percent_change_24h_text);
            percentChange7D = itemView.findViewById(R.id.percent_change_7d_text);
            lastUpdated = itemView.findViewById(R.id.last_updated_text);
            priceEur = itemView.findViewById(R.id.volume_eur_24h_text);
            volumeEur24H = itemView.findViewById(R.id.volume_eur_24h_text);
            marketCapEur = itemView.findViewById(R.id.market_cap_eur_text);
        }
    }
}
