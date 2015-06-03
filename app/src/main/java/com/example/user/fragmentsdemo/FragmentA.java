package com.example.user.fragmentsdemo;

import android.app.Fragment;
import android.app.Activity;
import android.util.Log;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by User on 6/1/2015.
 */
public class FragmentA extends Fragment {

    //added in 3rd example
   /* private static final String TAG = "FragmentLifeCycle";*/

    //added in 3rd example
    /*@Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.d(TAG,"onAttac()called");
    }*/

    //added in 3rd example
   /* @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate() Called");
    }*/

    //added in 3rd example
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState){
       /*Log.d(TAG, "onCreateView() called");*/

        // added in the 2nd 3rd and 4th Example
        View view = inflater.inflate(R.layout.my_frag, null, false);
        return view;
    }

    //added in 3rd example
  /*  @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onActivityCreated() called");
    }*/
    //added in 3rd Example
   /* @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart() called");
    }*/
    //added in 3rd Example
   /* @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume() called");
    }
    //added in 3rd Example
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause() called");
    }
    //added in 3rd Example
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop() called");
    }
    //added in 3rd Example
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() called");
    }
    //added in 3rd Example
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy() caleld");
    }
    //added in 3rd Example
    @Override
    public void onDetach(){
        super.onDetach();
        Log.d(TAG,"onDetach() called");
    }*/
}
