
package com.example.user.fragmentsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 6/1/2015.
 */
public class FragmentB extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState){
        View view = inflater.inflate(R.layout.my_frag, null, false);
        return view;
    }

    //added in 4th example
    @Override
    public void onStart(){
        super.onStart();

        Button btnGetText = (Button) getActivity().findViewById(R.id.btnGetText);
        btnGetText.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                TextView fragmentATextView = (TextView)getActivity().findViewById(R.id.fragmentATextView);
                Toast.makeText(getActivity(), fragmentATextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
