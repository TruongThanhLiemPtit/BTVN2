package com.example.admin.btvn_bai2;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_chitiet extends AppCompatActivity implements interfaces{

    private Adapter_chititet adapter_chititet;

    private RecyclerView recyclerView;
    private ImageView imageView;
    private ArrayList<Image> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        imageView=findViewById(R.id.img_chitiet);


        list=new ArrayList<>();
        for(int i=0;i<17;i++){
            list.add(new Image(i,false));
        }

        int key=getIntent().getIntExtra("key",0);
        setBackground(key);
        Image image=list.get(key);
        image.setChoose(true);
       list.set(key,image);
        adapter_chititet=new Adapter_chititet(list,this);
        recyclerView=findViewById(R.id.recycler_chitiet);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter_chititet);

        recyclerView.smoothScrollToPosition(key);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void Setimage(int id) {
        setBackground(id);
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIDimage()!=id&&list.get(i).isChoose())
            {
                Image image=list.get(i);
                image.setChoose(false);
                list.set(i,image);
            }
            else if(list.get(i).getIDimage()==id&&!list.get(i).isChoose()){
                Image image=list.get(i);
                image.setChoose(true);
                list.set(i,image);
            }

        }

        adapter_chititet.setList(list);
        adapter_chititet.notifyDataSetChanged();
        recyclerView.smoothScrollToPosition(id);
    }
    public void setBackground(int id){
        if(id==0){
            imageView.setBackgroundResource(R.drawable.a);

        }
        else if(id==1){
            imageView.setBackgroundResource(R.drawable.b);
        }
        else if(id==2){
            imageView.setBackgroundResource(R.drawable.c);
        }
        else if(id==3){
            imageView.setBackgroundResource(R.drawable.d);
        }
        else if(id==4){
            imageView.setBackgroundResource(R.drawable.e);
        }
        else if(id==5){
            imageView.setBackgroundResource(R.drawable.f);
        }
        else if(id==6){
            imageView.setBackgroundResource(R.drawable.g);
        }
        else if(id==7){
            imageView.setBackgroundResource(R.drawable.h);
        }
        else if(id==8){
            imageView.setBackgroundResource(R.drawable.i);
        }
        else if(id==9){
            imageView.setBackgroundResource(R.drawable.j);
        }
        else if(id==10){
            imageView.setBackgroundResource(R.drawable.k);
        }
        else if(id==11){
            imageView.setBackgroundResource(R.drawable.m);
        }
        else if(id==12){
            imageView.setBackgroundResource(R.drawable.n);
        }
        else if(id==13){
            imageView.setBackgroundResource(R.drawable.o);
        }
        else if(id==14){
            imageView.setBackgroundResource(R.drawable.p);
        }
        else if(id==15){
            imageView.setBackgroundResource(R.drawable.q);
        }
        else if(id==16){
            imageView.setBackgroundResource(R.drawable.z);
        }
    }
}
