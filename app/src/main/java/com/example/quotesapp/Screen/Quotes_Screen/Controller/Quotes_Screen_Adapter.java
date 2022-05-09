package com.example.quotesapp.Screen.Quotes_Screen.Controller;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.example.quotesapp.R;
import com.example.quotesapp.Screen.Quotes_Screen.Model.Quotes_Screen_ModelData;
import com.example.quotesapp.Screen.Quotes_Screen.View.quotes_screen;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Quotes_Screen_Adapter extends RecyclerView.Adapter<Quotes_Screen_Adapter.ViewData> {

    Activity activity;
    int i = 0;
    List<Quotes_Screen_ModelData> l2 = new ArrayList<>();


    public Quotes_Screen_Adapter(quotes_screen quotes_screen, List<Quotes_Screen_ModelData> l2) {

        activity = quotes_screen;
        this.l2 = l2;

    }


    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.quotes_screen_item, parent, false);

        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        String Text = l2.get(position).getS();
        holder.quotes_txt.setText(l2.get(position).getS());


        holder.change_images_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i < 20) {
                    holder.change_images_btn.setImageResource(l2.get(i).getI());

                    i++;

                    if (i >= 12) {
                        i = 0;
                    }

                }

            }
        });


        holder.copy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Copy("", Text);
                Toast.makeText(activity, "Copied", Toast.LENGTH_SHORT).show();

            }
        });

        holder.share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hello USER,\nPlease Rate Quotes App On Play Store\n⭐⭐⭐⭐⭐\n\nYOUR QUOTE\n \uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\n\n" + Text;
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, Text);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                activity.startActivity(Intent.createChooser(sharingIntent, "Share via"));

            }
        });

        holder.like_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.like_img.setImageResource(R.drawable.red_like);


            }
        });

        holder.download_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.img.setDrawingCacheEnabled(true);
                Bitmap bitamp = holder.img.getDrawingCache();

                try {
                    saveBitmap(activity,bitamp, Bitmap.CompressFormat.PNG,"image/*","newimg.png");
                }catch(Exception e) {

                }




            }
        });


    }

    @Override
    public int getItemCount() {

        return l2.size();

    }

    void Copy(String s, String text) {
        ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(activity.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(s, text);
        clipboard.setPrimaryClip(clip);
    }

    @NonNull
    public Uri saveBitmap(@NonNull final Context context, @NonNull final Bitmap bitmap, @NonNull final Bitmap.CompressFormat format, @NonNull final String mimeType, @NonNull final String displayName) throws IOException {

        final String relativeLocation = Environment.DIRECTORY_DCIM + File.separator + "Quotes App";
        final ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DISPLAY_NAME, displayName);
        values.put(MediaStore.MediaColumns.MIME_TYPE, mimeType);
        values.put(MediaStore.MediaColumns.RELATIVE_PATH, relativeLocation);

        final ContentResolver resolver = context.getContentResolver();
        Uri uri = null;

        try {
            final Uri contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri = resolver.insert(contentUri, values);

            if (uri == null)
                throw new IOException("Failed to create new MediaStore record.");

            try (final OutputStream stream = resolver.openOutputStream(uri)) {
                if (stream == null)
                    throw new IOException("Failed to open output stream.");

                if (!bitmap.compress(format, 95, stream))
                    throw new IOException("Failed to save bitmap.");
            }

            Toast.makeText(context, "Image Saved To\n" + uri, Toast.LENGTH_SHORT).show();

            return uri;
        } catch (IOException e) {

            if (uri != null) {
                // Don't leave an orphan entry in the MediaStore
                resolver.delete(uri, null, null);
            }

            throw e;
        }
    }


    public class ViewData extends RecyclerView.ViewHolder {

        TextView quotes_txt;
        ImageView change_images_btn, like_img;
        LinearLayout copy_btn, share_btn, like_btn, download_btn;
        FrameLayout img;

        public ViewData(@NonNull View itemView) {
            super(itemView);

            quotes_txt = itemView.findViewById(R.id.quotes_txt);
            change_images_btn = itemView.findViewById(R.id.change_images_btn);
            copy_btn = itemView.findViewById(R.id.copy_btn);
            like_btn = itemView.findViewById(R.id.like_btn);
            share_btn = itemView.findViewById(R.id.share_btn);
            like_img = itemView.findViewById(R.id.like_img);
            download_btn = itemView.findViewById(R.id.download_btn);
            img = itemView.findViewById(R.id.img);

        }



    }
}

