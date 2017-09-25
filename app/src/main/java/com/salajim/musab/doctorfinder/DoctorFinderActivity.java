package com.salajim.musab.doctorfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DoctorFinderActivity extends AppCompatActivity {
    @Bind(R.id.doctorsTextView) TextView mDoctorsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_finder);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String doctor = intent.getStringExtra("doctor");
        mDoctorsTextView.setText("Here are some doctors for: " + doctor);
    }
}
