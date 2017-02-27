package com.tikal.fuze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycleview)
    android.support.v7.widget.RecyclerView mEmailEditText;

    @BindView(R.id.button)
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
