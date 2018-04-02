package com.example.admin.btvn_bai2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class Adapter_chititet extends RecyclerView.Adapter<Adapter_chititet.mnViewholder>{

    private interfaces inte;
    private ArrayList<Image> list;

    public Adapter_chititet( ArrayList<Image> list,interfaces inte) {
        this.inte = inte;
        this.list = list;
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
        final Image image=list.get(position);
        if(image.isChoose()) {
            if (image.getIDimage() == 0) {
                holder.imageView2.setBackgroundResource(R.drawable.a);
            } else if (image.getIDimage() == 1) {
                holder.imageView2.setBackgroundResource(R.drawable.b);
            } else if (image.getIDimage() == 2) {
                holder.imageView2.setBackgroundResource(R.drawable.c);
            } else if (image.getIDimage() == 3) {
                holder.imageView2.setBackgroundResource(R.drawable.d);
            } else if (image.getIDimage() == 4) {
                holder.imageView2.setBackgroundResource(R.drawable.e);
            } else if (image.getIDimage() == 5) {
                holder.imageView2.setBackgroundResource(R.drawable.f);
            } else if (image.getIDimage() == 6) {
                holder.imageView2.setBackgroundResource(R.drawable.g);
            } else if (image.getIDimage() == 7) {
                holder.imageView2.setBackgroundResource(R.drawable.h);
            } else if (image.getIDimage() == 8) {
                holder.imageView2.setBackgroundResource(R.drawable.i);
            } else if (image.getIDimage() == 9) {
                holder.imageView2.setBackgroundResource(R.drawable.j);
            } else if (image.getIDimage() == 10) {
                holder.imageView2.setBackgroundResource(R.drawable.k);
            } else if (image.getIDimage() == 11) {
                holder.imageView2.setBackgroundResource(R.drawable.m);
            } else if (image.getIDimage() == 12) {
                holder.imageView2.setBackgroundResource(R.drawable.n);
            } else if (image.getIDimage() == 13) {
                holder.imageView2.setBackgroundResource(R.drawable.o);
            } else if (image.getIDimage() == 14) {
                holder.imageView2.setBackgroundResource(R.drawable.p);
            } else if (image.getIDimage() == 15) {
                holder.imageView2.setBackgroundResource(R.drawable.q);
            } else if (image.getIDimage() == 16) {
                holder.imageView2.setBackgroundResource(R.drawable.z);
            }
        }
        else{
            if (image.getIDimage() == 0) {
                holder.imageView2.setBackgroundResource(R.drawable.blura);

            } else if (image.getIDimage() == 1) {
                holder.imageView2.setBackgroundResource(R.drawable.blurb);
            } else if (image.getIDimage() == 2) {
                holder.imageView2.setBackgroundResource(R.drawable.blurc);
            } else if (image.getIDimage() == 3) {
                holder.imageView2.setBackgroundResource(R.drawable.blurd);
            } else if (image.getIDimage() == 4) {
                holder.imageView2.setBackgroundResource(R.drawable.blure);
            } else if (image.getIDimage() == 5) {
                holder.imageView2.setBackgroundResource(R.drawable.blurf);
            } else if (image.getIDimage() == 6) {
                holder.imageView2.setBackgroundResource(R.drawable.blurg);
            } else if (image.getIDimage() == 7) {
                holder.imageView2.setBackgroundResource(R.drawable.blurh);
            } else if (image.getIDimage() == 8) {
                holder.imageView2.setBackgroundResource(R.drawable.bluri);
            } else if (image.getIDimage() == 9) {
                holder.imageView2.setBackgroundResource(R.drawable.blurj);
            } else if (image.getIDimage() == 10) {
                holder.imageView2.setBackgroundResource(R.drawable.blurk);
            } else if (image.getIDimage() == 11) {
                holder.imageView2.setBackgroundResource(R.drawable.blurm);
            } else if (image.getIDimage() == 12) {
                holder.imageView2.setBackgroundResource(R.drawable.blurn);
            } else if (image.getIDimage() == 13) {
                holder.imageView2.setBackgroundResource(R.drawable.bluro);
            } else if (image.getIDimage() == 14) {
                holder.imageView2.setBackgroundResource(R.drawable.blurp);
            } else if (image.getIDimage() == 15) {
                holder.imageView2.setBackgroundResource(R.drawable.blurq);
            } else if (image.getIDimage() == 16) {
                holder.imageView2.setBackgroundResource(R.drawable.blurz);
            }
        }
        holder.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inte.Setimage(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class mnViewholder extends RecyclerView.ViewHolder {
        ImageView imageView2;
        public mnViewholder(View itemView) {
            super(itemView);
            imageView2=itemView.findViewById(R.id.img);
        }
    }
}
