package com.example.recycle_card_view_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class RecycleView extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Email> emailList;
    private emailAdapter emailAdapter;
    String[] sender = {"Facebook", "Google+", "Twitter", "Pinterest Weekly", "Josh"};
    String[] title = {"James, you have 1 new notification", "Top suggested Google+ pages for you", "Follow T-Mobile, Samsung Mobile-U", "Pins you'll love!", "Going Lunch"};
    String[] message = {"A lot has Hppened on Facebook since", "Top suggested Google+ pages for you", "james, some people you know", "Have you seen these pins yet? Pinterest", "Don't Forget our lunch at 3PM at Pizza Hut"};
    int[] pics = {
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_list);
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        emailList = new ArrayList<>();
        for (int i = 0; i < sender.length; i++) {
            Email email = new Email(sender[i], title[i],message[i], i+1, pics[i]);
            emailList.add(email);
        }
        Log.d("sdsds", String.valueOf(emailList.get(2)));
        emailAdapter = new emailAdapter(emailList);
        mRecyclerView.setAdapter(emailAdapter);
        emailAdapter.notifyDataSetChanged();


        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecycleView.this, "Card at " +position+ " is Clicked", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
