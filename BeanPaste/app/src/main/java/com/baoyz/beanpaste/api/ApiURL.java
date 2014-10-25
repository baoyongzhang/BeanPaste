package com.baoyz.beanpaste.api;

/**
 * Created by baoyz on 14-10-19.
 */
public class ApiURL {

    public static final String URL = "https://api.douban.com/v2";

    public static class Movie{
        public static final String URL = ApiURL.URL + "/movie";
        public static String TOP_250 = Movie.URL + "/top250";  // 正在上映
        public static String US_BOX = Movie.URL + "/us_box";  // 北美票房榜
        public static final String SUBJECT_INFO = Movie.URL + "/subject/{id}";    // 电影条目信息
        public static final String CELEBRITY_INFO = Movie.URL + "/celebrity/{id}";    // 影人条目信息
        public static final String SEARCH = Movie.URL + "/search?q={text}";    // 电影搜索
    }
}
