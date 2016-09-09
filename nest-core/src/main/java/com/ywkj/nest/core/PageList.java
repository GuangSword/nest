package com.ywkj.nest.core;

/**
 * Created by Jove on 2016/9/9.
 */
public class PageList<T> {
    private long totalCount;
    private long count;

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getTotalPage() {
        long residue = totalCount % count;
        if (residue == 0)
            return totalCount / count;
        else
            return totalCount / count + 1;
    }
}
