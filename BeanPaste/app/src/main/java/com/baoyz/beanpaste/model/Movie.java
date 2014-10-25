package com.baoyz.beanpaste.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baoyz on 14-10-19.
 */
public class Movie {

    private Rating rating;
    private Integer reviewsCount;
    private Integer wishCount;
    private Integer collectCount;
    private String doubanSite;
    private String year;
    private Images images;
    private String alt;
    private String id;
    private String mobileUrl;
    private String title;
    private Integer doCount;
    private String scheduleUrl;
    private List<String> genres = new ArrayList<String>();
    private List<String> countries = new ArrayList<String>();
    private List<Cast> casts = new ArrayList<Cast>();
    private String originalTitle;
    private String summary;
    private String subtype;
    private List<Director> directors = new ArrayList<Director>();
    private Integer commentsCount;
    private Integer ratingsCount;
    private List<String> aka = new ArrayList<String>();

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Integer getWishCount() {
        return wishCount;
    }

    public void setWishCount(Integer wishCount) {
        this.wishCount = wishCount;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public String getDoubanSite() {
        return doubanSite;
    }

    public void setDoubanSite(String doubanSite) {
        this.doubanSite = doubanSite;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDoCount() {
        return doCount;
    }

    public void setDoCount(Integer doCount) {
        this.doCount = doCount;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", wishCount=" + wishCount +
                ", collectCount=" + collectCount +
                ", doubanSite='" + doubanSite + '\'' +
                ", year='" + year + '\'' +
                ", images=" + images +
                ", alt='" + alt + '\'' +
                ", id='" + id + '\'' +
                ", mobileUrl='" + mobileUrl + '\'' +
                ", title='" + title + '\'' +
                ", doCount=" + doCount +
                ", scheduleUrl='" + scheduleUrl + '\'' +
                ", genres=" + genres +
                ", countries=" + countries +
                ", casts=" + casts +
                ", originalTitle='" + originalTitle + '\'' +
                ", summary='" + summary + '\'' +
                ", subtype='" + subtype + '\'' +
                ", directors=" + directors +
                ", commentsCount=" + commentsCount +
                ", ratingsCount=" + ratingsCount +
                ", aka=" + aka +
                '}';
    }
}
