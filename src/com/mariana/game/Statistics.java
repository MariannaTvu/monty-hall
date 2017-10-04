package com.mariana.game;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nicot on 10/4/2017.
 */
public class Statistics {
    public static final String WIN ="win";
    public static final String LOSE ="lose";

    private Map<String, Integer> statistics = new TreeMap();

    public String getStatistics() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Statistics: " +
                "win = " + statistics.get(WIN) +  " times; " +
                "lose = " + statistics.get(LOSE)+  " times.";
    }

    public void setResult(String result) {
        if (statistics.get(result) == null) {
            statistics.put(result, 1);
        } else {
            int count = statistics.get(result) + 1;
            statistics.put(result, count);
        }
    }
}
