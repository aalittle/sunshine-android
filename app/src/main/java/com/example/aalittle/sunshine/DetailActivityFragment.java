package com.example.aalittle.sunshine;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_detail, container, false);
        String passedForecast = getActivity().getIntent().getStringExtra(Intent.EXTRA_TEXT);
        TextView forecast_textview = (TextView) fragmentView.findViewById(R.id.forecast_description);
        forecast_textview.setText(passedForecast);

        return fragmentView;
    }
}
