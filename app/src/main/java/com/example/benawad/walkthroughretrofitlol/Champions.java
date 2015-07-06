package com.example.benawad.walkthroughretrofitlol;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class Champions {

    @Expose
    private int summonerId;
    @Expose
    private long modifyDate;
    @Expose
    private List<Champion> champions = new ArrayList<Champion>();

    /**
     *
     * @return
     * The summonerId
     */
    public int getSummonerId() {
        return summonerId;
    }

    /**
     *
     * @param summonerId
     * The summonerId
     */
    public void setSummonerId(int summonerId) {
        this.summonerId = summonerId;
    }

    /**
     *
     * @return
     * The modifyDate
     */
    public long getModifyDate() {
        return modifyDate;
    }

    /**
     *
     * @param modifyDate
     * The modifyDate
     */
    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     *
     * @return
     * The champions
     */
    public List<Champion> getChampions() {
        return champions;
    }

    /**
     *
     * @param champions
     * The champions
     */
    public void setChampions(List<Champion> champions) {
        this.champions = champions;
    }

}