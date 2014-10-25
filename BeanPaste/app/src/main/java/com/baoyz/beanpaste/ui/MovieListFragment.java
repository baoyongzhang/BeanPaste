package com.baoyz.beanpaste.ui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baoyz.beanpaste.AppModule;
import com.baoyz.beanpaste.R;
import com.baoyz.beanpaste.api.MovieApi;
import com.baoyz.beanpaste.model.Top250;
import com.baoyz.beanpaste.ui.adapter.MovieListAdapter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import dagger.ObjectGraph;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by baoyz on 14-10-19.
 */
public class MovieListFragment extends Fragment {

    private static final String ARG_INDEX = "index";

    private int mIndex;

    private OnFragmentInteractionListener mListener;

    @Inject
    MovieApi mApi;

    @InjectView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    public static MovieListFragment newInstance(int index) {
        MovieListFragment fragment = new MovieListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }
    public MovieListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mIndex = getArguments().getInt(ARG_INDEX);
        }
        ObjectGraph.create(new AppModule()).inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_list, container, false);
        ButterKnife.inject(this, rootView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        switch (mIndex){
            case 0:
                // Top250
                refreshTop250();
                break;
            case 1:
                // 北美
                break;
        }
        return rootView;
    }

    private void refreshTop250(){
        mApi.getTop250(new Callback<Top250>() {
            @Override
            public void success(Top250 top250, Response response) {
                mRecyclerView.setAdapter(new MovieListAdapter(top250.getSubjects()));
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    private void refreshTopUS(){
        mApi.getUSBox(new Callback<Top250>() {
            @Override
            public void success(Top250 top250, Response response) {
                mRecyclerView.setAdapter(new MovieListAdapter(top250.getSubjects()));
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
