package com.example.shubu.peb;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.Time;

public class Guard extends AppCompatActivity {
    Button search,reset;
    EditText car_no;
    String carno;
    Time inTime,outTime,duration;
    String current_time;
    String current_date;
    Calendar c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guard_entry);
        /*
        search=(Button)findViewById(R.id.search_vehicle);
        reset=(Button)findViewById(R.id.clear_vehicle);
        c=Calendar.getInstance();
        current_date=new SimpleDateFormat("dd-MM-yyyy").format(c.getTime());
        current_time=new java.text.SimpleDateFormat("HH:mm:ss").format(c.getTime());
        car_no=(EditText)findViewById(R.id.ETvehicle_no);
        carno=car_no.getText().toString();
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_vehicle(v);
            }
        });*/
    }

    public void search_vehicle(View view){
        DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference().child("user");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds:dataSnapshot.getChildren()){
                    User user=ds.getValue(User.class);
                    if (user.car_no.equals(carno)){
                        ResidentFragment residentFragment=new ResidentFragment();
                        residentFragment.setData(user.name,user.address,user.phone_no,user.car_no,inTime,outTime,duration);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
