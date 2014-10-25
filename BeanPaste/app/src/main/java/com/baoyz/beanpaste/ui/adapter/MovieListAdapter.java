package com.baoyz.beanpaste.ui.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baoyz.beanpaste.R;
import com.baoyz.beanpaste.model.Movie;
import com.baoyz.beanpaste.view.MovieImageView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by baoyz on 14-10-19.
 */
public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ViewHolder> implements View.OnClickListener {

    private List<Movie> mMovies;

    public MovieListAdapter(List<Movie> mMovies) {
        this.mMovies = mMovies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_movie, viewGroup, false));
        viewHolder.card.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Movie movie = mMovies.get(i);
        viewHolder.card.setTag(movie);
        viewHolder.iv_image.setMovie(movie, viewHolder.card, viewHolder.tv_title);
        viewHolder.tv_title.setText(movie.getTitle());
        viewHolder.tv_year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    @Override
    public void onClick(View v) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.iv_image)
        MovieImageView iv_image;
        @InjectView(R.id.tv_title)
        TextView tv_title;
        @InjectView(R.id.tv_year)
        TextView tv_year;
        @InjectView(R.id.cardview)
        CardView card;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }
    }
}
