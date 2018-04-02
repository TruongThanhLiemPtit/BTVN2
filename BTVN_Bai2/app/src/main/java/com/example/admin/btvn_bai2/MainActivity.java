package com.example.admin.btvn_bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter_Image adapter_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Image> list=new ArrayList<>();
        for(int i=0;i<17;i++){
            list.add(new Image(i,false));
        }
        recyclerView=findViewById(R.id.recyclerview);
        adapter_image=new Adapter_Image(list,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter_image);
    }
}
