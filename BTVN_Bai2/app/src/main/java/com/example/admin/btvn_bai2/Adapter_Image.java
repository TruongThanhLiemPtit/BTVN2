package com.example.admin.btvn_bai2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Admin on 31/3/2018.
 */

public class Adapter_Image extends RecyclerView.Adapter<Adapter_Image.mnViewholder> {
    private ArrayList<Image> list;
    private Context context;

    public Adapter_Image(ArrayList<Image> list,Context context) {
        this.list = list;
        this.context=context;
    }

    public ArrayList<Image> getList() {
        return list;
    }

    public void setList(ArrayList<Image> list) {
        this.list = list;
    }

    @Override
    public mnViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.image_item,null);

        return new mnViewholder(view);
    }

    @Override
    public void onBindViewHolder(mnViewholder holder, final int position) {
        Image image=list.get(position);
        if(image.getIDimage()==0){
            holder.imageView.setBackgroundResource(R.drawable.a);
        }
        else if(image.getIDimage()==1){
            holder.imageView.setBackgroundResource(R.drawable.b);
        }
        else if(image.getIDimage()==2){
            holder.imageView.setBackgroundResource(R.drawable.c);
        }
        else if(image.getIDimage()==3){
            holder.imageView.setBackgroundResource(R.drawable.d);
        }
        else if(image.getIDimage()==4){
            holder.imageView.setBackgroundResource(R.drawable.e);
        }
        else if(image.getIDimage()==5){
            holder.imageView.setBackgroundResource(R.drawable.f);
        }
        else if(image.getIDimage()==6){
            holder.imageView.setBackgroundResource(R.drawable.g);
        }
        else if(image.getIDimage()==7){
            holder.imageView.setBackgroundResource(R.drawable.h);
        }
        else if(image.getIDimage()==8){
            holder.imageView.setBackgroundResource(R.drawable.i);
        }
        else if(image.getIDimage()==9){
            holder.imageView.setBackgroundResource(R.drawable.j);
        }
        else if(image.getIDimage()==10){
            holder.imageView.setBackgroundResource(R.drawable.k);
        }
        else if(image.getIDimage()==11){
            holder.imageView.setBackgroundResource(R.drawable.m);
        }
        else if(image.getIDimage()==12){
            holder.imageView.setBackgroundResource(R.drawable.n);
        }
        else if(image.getIDimage()==13){
            holder.imageView.setBackgroundResource(R.drawable.o);
        }
        else if(image.getIDimage()==14){
            holder.imageView.setBackgroundResource(R.drawable.p);
        }
        else if(image.getIDimage()==15){
            holder.imageView.setBackgroundResource(R.drawable.q);
        }
        else if(image.getIDimage()==16){
            holder.imageView.setBackgroundResource(R.drawable.z);
        }
//        RecyclerView.LayoutParams layoutParams= (RecyclerView.LayoutParams) holder.itemView.getLayoutParams();
//        layoutParams.leftMargin=holder.itemView.getResources().getDimensionPixelOffset(R.dimen.my_dimen);
//        holder.itemView.setLayoutParams(layoutParams);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Activity_chitiet.class);
                intent.putExtra("key",position);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class mnViewholder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public mnViewholder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);

        }
    }
}
