package tads.eaj.com.bibliotecarecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Taniro on 21/09/2016.
 */

/*
* https://developer.android.com/reference/android/support/v7/widget/RecyclerView.OnItemTouchListener.html
 */
public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {

    OnItemClickListener mListener;
    GestureDetector mGestureDetector;


    public interface OnItemClickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    public RecyclerItemClickListener(Context context, final RecyclerView view ,OnItemClickListener listener) {
        mListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {

            /*
            * https://developer.android.com/reference/android/view/GestureDetector.OnGestureListener.html
             */
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                super.onSingleTapUp(e);
                View childView = view.findChildViewUnder(e.getX(), e.getY());
                if (childView != null && mListener != null ) {
                    mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
                }
                return true;
            }
            @Override
            public void onLongPress(MotionEvent e) {
                super.onLongPress(e);

                View childView = view.findChildViewUnder(e.getX(), e.getY());
                if(childView != null && mListener != null){
                    mListener.onItemLongClick(childView,view.getChildAdapterPosition(childView));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
