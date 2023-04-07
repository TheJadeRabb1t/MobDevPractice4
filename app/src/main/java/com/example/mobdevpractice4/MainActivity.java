package com.example.mobdevpractice4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_view, new ChoosingFragment(), ChoosingFragment.class.getSimpleName())
                    .commit();
        }
        Log.i(TAG, "Created");
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
    }
}