package io.plaidapp.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dhbk.android.plaidapp.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class SearchActivity2Fragment extends Fragment {

    public SearchActivity2Fragment() {
    }

    public static SearchActivity2Fragment newInstance() {
        return new SearchActivity2Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceStatte) {
        return inflater.inflate(R.layout.fragment_search2, container, false);
    }
}
