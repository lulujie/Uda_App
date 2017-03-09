package com.android.lulujie.udaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public  Button movie_button;
    public  Button stock_button;
    public  Button reader_button;
    public  Button news_button;
    public  Button design_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button movie_button = (Button) findViewById(R.id.movie_button);
        final Button stock_button = (Button) findViewById(R.id.stock_button);
        final Button reader_button = (Button) findViewById(R.id.reader_button);
        final Button news_button = (Button) findViewById(R.id.news_button);
        final Button design_button = (Button) findViewById(R.id.design_button);


    }

    public void movie_func(View view) {
        Toast.makeText(this, "启动应用：热门电影", Toast.LENGTH_SHORT).show();
    }
    public void stock_func(View view) {
        Toast.makeText(this, "启动应用：股市雄鹰", Toast.LENGTH_SHORT).show();
    }
    public void reader_func(View view) {
        Toast.makeText(this, "启动应用：XYZ阅读器", Toast.LENGTH_SHORT).show();
    }
    public void news_func(View view) {
        Toast.makeText(this, "启动应用：最新闻", Toast.LENGTH_SHORT).show();
    }
    public void design_func(View view) {
        Toast.makeText(this, "启动应用：毕业设计", Toast.LENGTH_SHORT).show();
    }

}
