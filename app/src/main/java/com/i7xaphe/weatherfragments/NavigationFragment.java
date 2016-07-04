package com.i7xaphe.weatherfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.io.File;

/**
 * Created by Kamil on 2016-05-15.
 */
public class NavigationFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.navigation_fragment,container,false);

        RelativeLayout rl = (RelativeLayout) v.findViewById(R.id.rl_navigation_fragment);
        rl.setOnClickListener(this);
        rl.getLayoutParams().height= 300;
        rl.getLayoutParams().width= 300;
        return v;

    }

    @Override
    public void onClick(View v) {
        getActivity().getFragmentManager().popBackStack();
    }
}
