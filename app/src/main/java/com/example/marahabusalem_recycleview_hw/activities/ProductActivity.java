package com.example.marahabusalem_recycleview_hw.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marahabusalem_recycleview_hw.R;
import com.example.marahabusalem_recycleview_hw.adapters.ProductAdapter;
import com.example.marahabusalem_recycleview_hw.models.ProductClass;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<ProductClass> productClasses;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product);

        rv = findViewById(R.id.rv);

        String title = "Bitzwolf B-CC1 Camera 1080P Hd Webcame";

        productClasses = new ArrayList<>();
        productClasses.add(new ProductClass(1, R.drawable.camera_tripod, title, "US$48.89"));
        productClasses.add(new ProductClass(2, R.drawable.camera_dome, title, "US$55.89"));
        productClasses.add(new ProductClass(3, R.drawable.webcam, title, "US$78.89"));
        productClasses.add(new ProductClass(4, R.drawable.printer, title, "US$88.55"));
        productClasses.add(new ProductClass(5, R.drawable.camera_white, title, "US$23.67"));
        productClasses.add(new ProductClass(6, R.drawable.camera_tripod2, title, "US$44.89"));

        productAdapter = new ProductAdapter(productClasses, ProductActivity.this);
        rv.setLayoutManager(new GridLayoutManager(ProductActivity.this, 2));
        rv.setAdapter(productAdapter);
    }
}
