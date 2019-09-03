package com.example.recycle_card_view_8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
    private OnItemClickListener mListener;
    GestureDetector mGestureDoctor;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }
    public RecyclerItemClickListener(Context context, OnItemClickListener listener) {
        mListener = listener;
        mGestureDoctor = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }
    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        View childView = rv.findChildViewUnder(e.getX(),e.getY());
        if (childView != null && mListener != null && mGestureDoctor.onTouchEvent(e)) {
            mListener.onItemClick(childView, rv.getChildAdapterPosition(childView));
        }
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}

