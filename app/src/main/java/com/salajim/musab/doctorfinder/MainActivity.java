package com.salajim.musab.doctorfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.findDocBtn) Button mDocBtn;
    @Bind(R.id.findDocEditText) EditText mDocEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mDocBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mDocBtn) {
            String doctor = mDocEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, DoctorFinderActivity.class);
            intent.putExtra("doctor", doctor);
            startActivity(intent);
        }
    }
}
