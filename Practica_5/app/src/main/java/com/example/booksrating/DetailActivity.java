package com.example.booksrating;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.example.booksrating.databinding.ActivityDetailBinding;
import com.example.booksrating.databinding.ActivityMainBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String BOOK_KEY = "book";
    public static final String BITMAP_KEY = "bitmap";

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        Book ratedBook = extras.getParcelable(BOOK_KEY);
        Bitmap bitmap = extras.getParcelable(BITMAP_KEY);

        if(bitmap!=null){
            binding.imageView.setImageBitmap(bitmap);
        }
        binding.setRatedBook(ratedBook);
    }
}