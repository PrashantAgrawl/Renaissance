package com.strangers.rennaissance;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 15/12/15.
 */
public class AboutUs extends Fragment {
    private static int mSelectedPosition;
    private LinearLayout linearLayout;
    private static String TAG="About Us";
    public static AboutUs newInstance(int position) {
        mSelectedPosition=position;
        AboutUs fragment = new AboutUs();
        Bundle args = new Bundle();
        args.putInt("Position", position);
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if((linearLayout=(LinearLayout)inflater.inflate(R.layout.about_us,container,false))==null)
            Log.d(TAG,"linear null");
        TextView tv=(TextView)linearLayout.findViewById(R.id.fragText);
        tv.setText("Teri maa ki aankh");
        return linearLayout;
    }

}
