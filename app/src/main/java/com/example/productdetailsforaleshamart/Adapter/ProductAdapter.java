package com.example.productdetailsforaleshamart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productdetailsforaleshamart.R;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {
    Context context;

    public ProductAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.related_product_detail_item,parent,false);

        return new ProductHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class ProductHolder extends RecyclerView.ViewHolder {
        ImageView related_product_image;
        TextView product_name,product_type,product_price,product_add_to_cart;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            related_product_image=itemView.findViewById(R.id.productIVId);
            product_name=itemView.findViewById(R.id.productNameTVId);
            product_type=itemView.findViewById(R.id.productTypeTVId);
            product_price=itemView.findViewById(R.id.productPriceTVId);
            product_add_to_cart=itemView.findViewById(R.id.addCartTVId);



        }
    }
}
