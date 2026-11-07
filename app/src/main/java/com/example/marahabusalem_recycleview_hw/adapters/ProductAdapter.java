package com.example.marahabusalem_recycleview_hw.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marahabusalem_recycleview_hw.R;
import com.example.marahabusalem_recycleview_hw.models.ProductClass;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolderClass> {

    ArrayList<ProductClass> arrayList;
    Activity activity;

    public ProductAdapter(ArrayList<ProductClass> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.productitem, parent, false);
        return new ViewHolderClass(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolderClass holder, int position) {
        holder.img_pr.setImageResource(arrayList.get(position).getImage());
        holder.name_pr.setText(arrayList.get(position).getName());
        holder.price_pr.setText(arrayList.get(position).getPrice());

        holder.cart_pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public ImageView img_pr, cart_pr;
        public TextView name_pr, price_pr;
        public RelativeLayout relative_pr;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            img_pr = itemView.findViewById(R.id.img_pr);
            cart_pr = itemView.findViewById(R.id.cart_pr);
            name_pr = itemView.findViewById(R.id.name_pr);
            price_pr = itemView.findViewById(R.id.price_pr);
            relative_pr = itemView.findViewById(R.id.relative_pr);
        }
    }
}
