package com.baoyz.beanpaste;

import com.baoyz.beanpaste.api.ApiURL;
import com.baoyz.beanpaste.api.MovieApi;
import com.baoyz.beanpaste.ui.MainActivity;
import com.baoyz.beanpaste.ui.MovieListFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by baoyz on 14-10-19.
 */
@Module(
        injects = {
                MainActivity.class,
                MovieListFragment.class
        }
)
public class AppModule {

    @Provides
    public MovieApi provideMovieApi(RestAdapter restAdapter) {
        return restAdapter.create(MovieApi.class);
    }

    @Singleton
    @Provides
    public RestAdapter provideRestAdapter() {
        return new RestAdapter.Builder()
                .setEndpoint(ApiURL.Movie.URL)
                .build();
    }
}
