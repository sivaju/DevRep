package com.sooryen.spsmod.model;

/**
 * Created by shivakrishna on 14/07/16.
 */
public class StragicPortofolio
{
     private Float equity;
     private Float fixedDeposite;
     private Float liquedCash;

    public Float getEquity() {
        return equity;
    }

    public void setEquity(Float equity) {
        this.equity = equity;
    }

    public Float getFixedDeposite() {
        return fixedDeposite;
    }

    public void setFixedDeposite(Float fixedDeposite) {
        this.fixedDeposite = fixedDeposite;
    }

    public Float getLiquedCash() {
        return liquedCash;
    }

    public void setLiquedCash(Float liquedCash) {
        this.liquedCash = liquedCash;
    }

    public StragicPortofolio() {
    }

    public StragicPortofolio(Float equity, Float fixedDeposite, Float liquedCash) {
        this.equity = equity;
        this.fixedDeposite = fixedDeposite;
        this.liquedCash = liquedCash;
    }
}
