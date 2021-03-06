package com.example.administrator.eshop.activity.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.eshop.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import jp.wasabeef.picasso.transformations.GrayscaleTransformation;

/**
 * Created by Administrator on 2017/2/24.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {

    public View itemView;
    private Context context;
    public TextView textView;
    public ImageView imageView;
    private OnItemClickListener listener;

    public BaseViewHolder(View itemView, Context context) {
        super(itemView);
        this.itemView = itemView;
        this.context = context;
//        itemView.setOnClickListener(this);
    }

//    public <T extends View> T getItemView(int viewType,) {
//
//    }

    public <T extends View> T getViewId(@IdRes int viewId) {
        return (T) itemView.findViewById(viewId);
    }

//    public <T extends View> T getLayoutId(@LayoutRes int viewId) {
//        View layoutView = LayoutInflater.from(context).inflate(viewId,null);
//        return (T) layoutView;
//    }

    public void setTextView(@IdRes int viewId, CharSequence text) {
        textView = getViewId(viewId);
        textView.setText(text);

    }

    public void setImageView(@IdRes int viewId, String url) {
        imageView = getViewId(viewId);
        Glide.with(context).load(url).into(imageView);
//        Picasso.with(context).load(url).into(imageView);
    }

//    public void setImageView( int[] viewIds,int[] itemLayoutId,int viewType,List<String> urlList) {
//        ImageView[] imgs = new ImageView[viewIds.length];
//        for (int i = 0; i < viewIds.length; i++) {
//           imageView= getViewId(viewIds[i]);
//            imgs[i] = imageView;
//        }
//        for (int i = 0; i < itemLayoutId.length; i++) {
//            if (viewType==i){
//                if (imageView != null) {
//                    for (int i1 = 0; i1 < urlList.size(); i1++) {
//                            Glide.with(context).load(urlList.get(i1)).into(imgs[i1]);
//                    }
//                    return;
//                }
//
//            }
//        }
//    }

    public void setPicassoImage(@IdRes int viewId, String url) {
        imageView = getViewId(viewId);
        Picasso.with(context).load(url)
                .transform(new CropCircleTransformation())
                .into(imageView);
    }

    public void setViewOnClick(@IdRes int viewId, int[] layoutId, int viewType, final OnItemClickListener listener) {
        View listenView = null;
        if (listener != null) {
            for (int i = 0; i < layoutId.length; i++) {
                if (viewType == i) {
//            View layoutView = getLayoutId(layoutId);
                    listenView = getViewId(viewId);
                    if (listenView != null) {
                        listenView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                listener.OnItemClick(view);
                            }
                        });
                    }
                }
            }

        }
    }

    public interface OnItemClickListener {

        void OnItemClick(View view);

    }

}
