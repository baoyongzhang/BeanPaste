package com.baoyz.beanpaste.model;

import java.util.List;

/**
 * Created by baoyz on 14-10-19.
 */
public class Top250 {

    private Integer start;
    private Integer count;
    private Integer total;
    private String title;
    private List<Movie> subjects;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Movie> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Movie> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Top250{" +
                "start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", title='" + title + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
