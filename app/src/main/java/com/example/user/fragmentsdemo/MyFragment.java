package com.example.user.fragmentsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;/**
 * Created by User on 6/1/2015
*/


import com.example.user.fragmentsdemo.R;

public class MyFragment extends  Fragment{
      @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState){
          View view = inflater.inflate(R.layout.my_frag, null, false);
          return view;
      }
 }

