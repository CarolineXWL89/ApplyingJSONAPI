package com.example.caroline.applyingjsonapi;

/**
 * Created by princ on 23/01/2018.
 */

public class Cryptocurrency {


    /* example of type of cryptocurrency + vars
     "id": "bitcoin",
        "name": "Bitcoin",
        "symbol": "BTC",
        "rank": "1",
        "price_usd": "573.137",
        "price_btc": "1.0",
        "24h_volume_usd": "72855700.0",
        "market_cap_usd": "9080883500.0",
        "available_supply": "15844176.0",
        "total_supply": "15844176.0",
        "percent_change_1h": "0.04",
        "percent_change_24h": "-0.3",
        "percent_change_7d": "-0.57",
        "last_updated": "1472762067"

        Other currency
        "id": "bitcoin",
        "name": "Bitcoin",
        "symbol": "BTC",
        "rank": "1",
        "price_usd": "11162.2",
        "price_btc": "1.0",
        "24h_volume_usd": "10427200000.0",
        "market_cap_usd": "187770383291",
        "available_supply": "16821987.0",
        "total_supply": "16821987.0",
        "max_supply": "21000000.0",
        "percent_change_1h": "0.37",
        "percent_change_24h": "6.26",
        "percent_change_7d": "-2.46",
        "last_updated": "1516740865",
        "price_eur": "9092.4602272",
        "24h_volume_eur": "8493746867.2",
        "market_cap_eur": "152953247740"
     */
    private String id, currencyName, symbol;
    private int rank;
    private double price_usd;
    private double price_btc;
    private double volume_usd_24;
    private double market_cap_usd;
    private double available_supply;
    private double total_supply;
    private double max_supply;
    private double percent_change1h;
    private double percent_change24h;
    private double percent_change_7d;
    private int last_updated;
    private double price_eur;
    private double volume_eur_24h;
    private double market_cap_eur;

    public Cryptocurrency() {
        this.id = "bitcoin";
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
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(double price_usd) {
        this.price_usd = price_usd;
    }

    public double getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(double price_btc) {
        this.price_btc = price_btc;
    }

    public double getVolume_usd_24() {
        return volume_usd_24;
    }

    public void setVolume_usd_24(double volume_usd_24) {
        this.volume_usd_24 = volume_usd_24;
    }

    public double getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(double market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public double getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(double available_supply) {
        this.available_supply = available_supply;
    }

    public double getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(double total_supply) {
        this.total_supply = total_supply;
    }

    public double getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(double max_supply) {
        this.max_supply = max_supply;
    }

    public double getPercent_change1h() {
        return percent_change1h;
    }

    public void setPercent_change1h(double percent_change1h) {
        this.percent_change1h = percent_change1h;
    }

    public double getPercent_change24h() {
        return percent_change24h;
    }

    public void setPercent_change24h(double percent_change24h) {
        this.percent_change24h = percent_change24h;
    }

    public double getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(double percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public int getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }

    public double getPrice_eur() {
        return price_eur;
    }

    public void setPrice_eur(double price_eur) {
        this.price_eur = price_eur;
    }

    public double getVolume_eur_24h() {
        return volume_eur_24h;
    }

    public void setVolume_eur_24h(double volume_eur_24h) {
        this.volume_eur_24h = volume_eur_24h;
    }

    public double getMarket_cap_eur() {
        return market_cap_eur;
    }

    public void setMarket_cap_eur(double market_cap_eur) {
        this.market_cap_eur = market_cap_eur;
    }
}
