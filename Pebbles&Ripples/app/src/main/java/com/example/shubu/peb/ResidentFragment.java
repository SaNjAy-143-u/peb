package com.example.shubu.peb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Time;

/**
 * Created by dell on 7/21/2017.
 */

public class ResidentFragment extends Fragment {
    TextView name,address,phone_no,car_no,in_time,out_time,duration;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.resident_fragment,container,false);
        name=(TextView)view.findViewById(R.id.name);
        address=(TextView)view.findViewById(R.id.address);
        phone_no=(TextView)view.findViewById(R.id.phone_no);
        car_no=(TextView)view.findViewById(R.id.car_no);
        in_time=(TextView)view.findViewById(R.id.intime);
        out_time=(TextView)view.findViewById(R.id.outtime);
        duration=(TextView)view.findViewById(R.id.duration);
        return view;
    }
    public void setData(String name,String address,String phone_no,String car_no,Time in_time,Time out_time,Time duration)
    {
        this.name.setText(name);
        this.address.setText(address);
        this.phone_no.setText(phone_no);
        this.car_no.setText(car_no);
        this.in_time.setText(in_time.toString());
        this.out_time.setText(out_time.toString());
        this.duration.setText(duration.toString());
    }
}
