package com.example.shubu.peb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class VisitorFragment extends Fragment{
    TextView name,in_time,out_time,duration,guard;
    EditText visit_to,phone_no,source,purpose;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.resident_fragment,container,false);
        name=(TextView)view.findViewById(R.id.name);
        visit_to=(EditText) view.findViewById(R.id.address);
        phone_no=(EditText) view.findViewById(R.id.phone_no);
        source=(EditText)view.findViewById(R.id.source);
        purpose=(EditText)view.findViewById(R.id.purpose);
        guard=(TextView)view.findViewById(R.id.guard);
        in_time=(TextView)view.findViewById(R.id.intime);
        out_time=(TextView)view.findViewById(R.id.outtime);
        duration=(TextView)view.findViewById(R.id.duration);
        return view;
    }
    public  void setData(Visit visit){

    }
}
