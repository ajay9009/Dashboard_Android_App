package com.example.dashboard.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboard.HelperClasses.CategoriesHelperClass;
import com.example.dashboard.R;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.AdapterAllCategoriesViewHolder> {

    ArrayList<CategoriesHelperClass> categoriesLocations;

    public CategoriesAdapter(ArrayList<CategoriesHelperClass> mostViewedLocations) {
        this.categoriesLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public AdapterAllCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cetogories_card_design, parent, false);
        AdapterAllCategoriesViewHolder lvh = new AdapterAllCategoriesViewHolder(view);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAllCategoriesViewHolder holder, int position) {

        CategoriesHelperClass helperClass = categoriesLocations.get(position);
        holder.image.setImageResource(helperClass.getImage());
        holder.title.setText(helperClass.getTitle());
        holder.relativeLayout.setBackground(helperClass.getGradient());
    }

    @Override
    public int getItemCount() {
        return categoriesLocations.size();
    }

    public static class AdapterAllCategoriesViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayout;
        ImageView image;
        TextView title, desc;

        public AdapterAllCategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayout = itemView.findViewById(R.id.c_gradient);
            image = itemView.findViewById(R.id.categories_image);
            title = itemView.findViewById(R.id.categories_title);
            desc  = itemView.findViewById(R.id.categories_desc);
        }
    }
}