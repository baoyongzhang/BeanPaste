package com.baoyz.beanpaste.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.baoyz.beanpaste.model.Movie;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.IOException;

/**
 * MovieImageView
 */
public class MovieImageView extends ImageView implements Callback{

    private Movie mMovie;
    private View mBgView;
    private TextView mTextView;

    public MovieImageView(Context context) {
        super(context);
        init(null, 0);
    }

    public MovieImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public MovieImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {

    }

    public void setMovie(Movie movie, View bgView, TextView textView) {
        this.mMovie = movie;
        display();
        mBgView = bgView;
        mTextView = textView;
    }

    private void display() {
        if (mMovie == null)
            return;
//        Picasso.with(getContext()).load(Uri.parse(mMovie.getImages().getMedium())).into(this, this);

        new AsyncTask<Void, Void, Bitmap>(){

            @Override
            protected Bitmap doInBackground(Void... params) {
                Bitmap bitmap = null;
                try {
                    bitmap = Picasso.with(getContext()).load(Uri.parse(mMovie.getImages().getMedium())).get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return bitmap;
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                setImageBitmap(bitmap);
                Palette.generateAsync(bitmap, new Palette.PaletteAsyncListener() {
                    @Override
                    public void onGenerated(Palette palette) {
                        Palette.Swatch swatch = palette.getMutedSwatch();
                        if (swatch != null){
                            mBgView.setBackgroundColor(swatch.getRgb());
                            mTextView.setTextColor(swatch.getTitleTextColor());
                        }

                    }
                });
                super.onPostExecute(bitmap);
            }
        }.execute();
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    @Override
    public void onSuccess() {
    }

    @Override
    public void onError() {

    }
}
