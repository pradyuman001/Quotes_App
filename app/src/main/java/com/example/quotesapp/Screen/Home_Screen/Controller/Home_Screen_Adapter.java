package com.example.quotesapp.Screen.Home_Screen.Controller;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.R;
import com.example.quotesapp.Screen.Home_Screen.Model.Home_Screen_ModelData;
import com.example.quotesapp.Screen.Home_Screen.View.home_screen;
import com.example.quotesapp.Screen.Quotes_Screen.View.quotes_screen;

import java.util.List;

public class Home_Screen_Adapter extends RecyclerView.Adapter<Home_Screen_Adapter.ViewData> {

    Activity activity;
    List<Home_Screen_ModelData> l1;

    public Home_Screen_Adapter(home_screen home_screen, List<Home_Screen_ModelData> l1) {

        activity = home_screen;
        this.l1 = l1;

    }

    @NonNull
    @Override
    public Home_Screen_Adapter.ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.home_screen_item,parent,false);

        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Home_Screen_Adapter.ViewData holder, int position) {

        String cat = l1.get(position).quotes();
        holder.category_txt.setText(l1.get(position).quotes());
        holder.quotes_images.setImageResource(l1.get(position).img());

        holder.quotes_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(activity, ""+cat, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(activity, quotes_screen.class);
                intent.putExtra("n1",cat);
                activity.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return l1.size();
    }


    public class ViewData extends RecyclerView.ViewHolder {

        TextView category_txt;
        ImageView quotes_images;
        CardView quotes_card;

        public ViewData(@NonNull View itemView) {
            super(itemView);

            category_txt = itemView.findViewById(R.id.category_txt);
            quotes_images = itemView.findViewById(R.id.quotes_images);
            quotes_card = itemView.findViewById(R.id.quotes_card);

        }
    }
}
