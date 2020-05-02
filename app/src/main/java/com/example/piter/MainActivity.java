package com.example.piter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.example.piter.AdapterForList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row);

        button = findViewById(R.id.button);
        //listView = findViewById(R.id.list_view);

        //AdapterForList adapter = new AdapterForList(this, initData());

        //listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scrine_adapter.class);
                startActivity(intent);
            }
        });
    }

    private List<AdapterForList> initData(){
        List<AdapterForList> list = new ArrayList<AdapterForList>();

        list.add(new AdapterForList());

        return list;
    }
}
