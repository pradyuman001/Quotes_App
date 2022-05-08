package com.example.quotesapp.Screen.Quotes_Screen.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quotesapp.R;
import com.example.quotesapp.Screen.Quotes_Screen.Controller.Quotes_Screen_Adapter;
import com.example.quotesapp.Screen.Quotes_Screen.Model.Quotes_Screen_ModelData;

import java.util.ArrayList;
import java.util.List;

public class quotes_screen extends AppCompatActivity {

    private ImageView back_img;
    TextView type_txt;
    RecyclerView rv_category;
    String[] category = {"ALONE","ANGRY","ANNIVERSARY","ATTITUDE","AWESOME","BIRTHDAY","BREAK UP","COOL","CREATIVE","EMOTIONAL","EXAM","FRIENDSHIP","HAPPY","LOVE","MOTIVATION","NIGHT","SAD","SUCCESS","SINGLE","SPIRITUAL"};
    int[] images = {R.drawable.alone,R.drawable.angry,R.drawable.anniversary,R.drawable.attitude,R.drawable.awesome,R.drawable.birthday,R.drawable.breakup,R.drawable.cool,R.drawable.creative,R.drawable.emotional,
            R.drawable.exam,R.drawable.friendship,R.drawable.happy,R.drawable.love,R.drawable.motivation,R.drawable.night,R.drawable.sad,R.drawable.success,R.drawable.single,R.drawable.spi,};
    List<Quotes_Screen_ModelData> l2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quotes_screen);

        binding();



        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(rv_category);

        String type = getIntent().getStringExtra("n1");
        type_txt.setText(type+" QUOTES");

        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });




        if(type.equals(category[0])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Alone = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Alone.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Alone[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[1])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Angry = {"”Some things can never be forgotten and nor forgiven.” \n\n– T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Angry.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Angry[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[2])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Anniversary = {"“For the two of us, home isn’t a place. It is a person. And we are finally home.”\n\n" +"Stephanie Perkins",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Anniversary.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Anniversary[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[3])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Attitude = {"Beauty is only skin deep. Attitude is down to the bone.\n\n – Gautama Buddha",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Attitude.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Attitude[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[4])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Awesome = {"“You only live once, but if you do it right, once is enough.”\n\n — Mae West",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Awesome.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Awesome[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[5])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Birthday = {"“May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.”\n\n",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Birthday.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Birthday[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[6])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] BreakUp = {"\"Don’t let someone who isn’t worth your love make you forget how much you are worth.\"\n",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < BreakUp.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(BreakUp[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[7])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Cool = {"The greatest glory in living lies not in never falling, but in rising every time we fall.\n\n -Nelson Mandela",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Cool.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Cool[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[8])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Creative = {"“Creativity doesn’t wait for that perfect moment. It fashions its own perfect moments out of ordinary ones.” \n\n— Bruce Garrabrandt",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Creative.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Creative[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[9])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Emotional = {"To live is the rarest thing in the world. Most people exist, that is all.\n\n – Oscar Wilde",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Emotional.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Emotional[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[10])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Exam = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Exam.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Exam[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[11])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Friend = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Friend.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Friend[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[12])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Happy = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Happy.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Happy[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[13])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Love = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Love.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Love[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[14])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Motivation = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Motivation.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Motivation[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[15])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Night = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Night.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Night[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[16])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Sad = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Sad.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Sad[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[17])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Success = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Success.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Success[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[18])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Single = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Single.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Single[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }

        else if(type.equals(category[19])){

            int[] images = {R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6,R.drawable.bg7,R.drawable.bg8,R.drawable.bg9,R.drawable.bg10,
                    R.drawable.bg11,R.drawable.bg12,R.drawable.bg14,R.drawable.bg15,R.drawable.bg16,R.drawable.alone3,R.drawable.bg1,R.drawable.bg2,R.drawable.alone3,R.drawable.bg4,};
            String[] Spi = {"”Associate yourself with people of good quality, for it is better to be alone than in bad company.” \n\n– Booker T. Washington",
                    "”Without great solitude no serious work is possible.” \n\n– Pablo Picasso",
                    "”No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.” \n\n – Gautama Buddha",
                    "”I used to think that the worst thing in life was to end up all alone. It’s not. The worst thing in life is ending up with people who make you feel all alone.” \n\n– Robin Williams",
                    "”Until you get comfortable with being alone, you’ll never know if you’re choosing someone out of love or loneliness.”\n\n – Mandy Hale",
                    "”In order to be open to creativity, one must have the capacity for constructive use of solitude. One must overcome the fear of being alone.” \n\n – Rollo May",
                    "“Being alone and actually sitting with our own thoughts can lead to such growth and realizations that are rare in our everyday busy lives.” \n\n – Kourtney Kardashian",
                    "“I’m fascinated with myself and love hearing the sound of my own voice. I’d like to hear what I have to say. A lot of people don’t like being alone because they truly don’t like themselves, but I love me.” \n\n – Gene Simmons",
                    "“The thought of being on my own really terrified me. But then I realized being alone is really a cleansing thing.”  \n\n –  Lindsey Buckingham",
                    "“Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.” \n\n – Henry Rollins",
                    "”If you want to be happy, learn to be alone without being lonely. Learn that being alone does not mean being unhappy. The world is full of plenty of interesting and enjoyable things to do and people who can enrich your life.” \n\n – Michael Josephson",
                    "”We need quiet time to examine our lives openly and honestly – spending quiet time alone gives your mind an opportunity to renew itself and create order.”  \n\n– Susan L. Taylor",
                    "”Nothing else so destroys the power to stand alone as the habit of leaning upon others. If you lean, you will never be strong or original. Stand alone or bury your ambition to be somebody in the world.” \n\n – Orison Swett Marden",
                    "“You cannot be lonely if you like the person you’re alone with.” \n\n– Wayne Dyer",
                    "”If you wanted to do something absolutely honest, something true, it always turned out to be a thing that had to be done alone.”  \n\n – Richard Yates",
                    "”Sometimes you need to take a break from everyone and spend time alone, to experience, appreciate and love yourself.”  \n\n – Robert Tew",
                    "”When you learn how to be alone you’ll discover the difference between alone and lonely.”  \n\n – LJ Vanier",
                    "”Truth is, I’m generally happiest when it’s just me. It’s okay to be madly in love with yourself.” \n\n – Richelle E. Goodrich",
                    "”One of the greatest regrets in life is being what others would want you to be, rather than being yourself.” \n\n– Shannon L. Alder",
                    "”You are never alone. You are eternally connected with everyone.” \n\n – Amit Ray"};


            for (int i = 0; i < Spi.length; i++) {
                Quotes_Screen_ModelData quotes_screen_modelData = new Quotes_Screen_ModelData(Spi[i],images[i]);
                l2.add(quotes_screen_modelData);
                Quotes_Screen_Adapter rvAdapter = new Quotes_Screen_Adapter(quotes_screen.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);


            }
        }


    }


    private void binding() {

        back_img = findViewById(R.id.back_img);
        type_txt = findViewById(R.id.type_txt);
        rv_category = findViewById(R.id.rv_category);


    }

}