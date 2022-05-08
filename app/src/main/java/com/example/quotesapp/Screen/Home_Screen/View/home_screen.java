package com.example.quotesapp.Screen.Home_Screen.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.quotesapp.R;
import com.example.quotesapp.Screen.Home_Screen.Controller.Home_Screen_Adapter;
import com.example.quotesapp.Screen.Home_Screen.Model.Home_Screen_ModelData;
import com.example.quotesapp.Screen.Quotes_Screen.View.quotes_screen;

import java.util.ArrayList;
import java.util.List;

public class home_screen extends AppCompatActivity {

    public RecyclerView recycler_view;
    String[] type = {"ALONE","ANGRY","ANNIVERSARY","ATTITUDE","AWESOME","BIRTHDAY","BREAK UP","COOL","CREATIVE","EMOTIONAL","EXAM","FRIENDSHIP","HAPPY","LOVE","MOTIVATION","NIGHT","SAD","SUCCESS","SINGLE","SPIRITUAL"};
    int[] images = {R.drawable.alone,R.drawable.angry,R.drawable.anniversary,R.drawable.attitude,R.drawable.awesome,R.drawable.birthday,R.drawable.breakup,R.drawable.cool,R.drawable.creative,R.drawable.emotional,
            R.drawable.exam,R.drawable.friendship,R.drawable.happy,R.drawable.love,R.drawable.motivation,R.drawable.night,R.drawable.sad,R.drawable.success,R.drawable.single,R.drawable.spi,};

    List<Home_Screen_ModelData> l1 = new ArrayList<>();

    ImageView exit_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        binding();

        adapter();

        exit_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alert_dialog();

            }
        });



    }

    private void adapter() {

        for (int i = 0; i < type.length; i++) {
            Home_Screen_ModelData modal_data= new Home_Screen_ModelData(type[i],images[i]);
            l1.add(modal_data);
        }

        Home_Screen_Adapter myAdapter = new Home_Screen_Adapter(home_screen.this,l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(myAdapter);



    }

    private void binding() {

        recycler_view = findViewById(R.id.recycler_view);
        exit_img = findViewById(R.id.exit_img);

    }

    void custom_dialog(){

        Dialog dialog = new Dialog(home_screen.this);
        dialog.setContentView(R.layout.dialog);

        Button yes_btn = dialog.findViewById(R.id.yes_btn);
        Button no_btn = dialog.findViewById(R.id.no_btn);

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(home_screen.this, "YES", Toast.LENGTH_SHORT).show();

                dialog.dismiss();

            }
        });


        dialog.show();


    }

     void alert_dialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(home_screen.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }


}