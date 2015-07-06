package com.example.benawad.walkthroughretrofitlol;

import com.google.gson.annotations.Expose;

/**
 * Created by benawad on 7/6/15.
 */
public class Champion {

    @Expose
    private int id;
    @Expose
    private Stats stats;

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     *
     * @param stats
     * The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
