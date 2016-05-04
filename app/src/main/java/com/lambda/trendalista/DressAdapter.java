package com.lambda.trendalista;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

/**
 * Created by harshal on 11/11/15.
 */
public class DressAdapter extends ArrayAdapter<Dresses> {

        Context c;
        int layoutResourceId;
        ArrayList<Dresses> data=new ArrayList<Dresses>();
        public DressAdapter(Context context, int layoutResourceId, ArrayList<Dresses> data) {
            super(context, layoutResourceId, data);
            this.layoutResourceId = layoutResourceId;
            this.c = context;
            this.data = data;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            ImageHolder holder = null;
            if(row == null)
            {
                LayoutInflater inflater = ((Activity)c).getLayoutInflater();
                row = inflater.inflate(layoutResourceId, parent, false);
                holder = new ImageHolder();
                holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
                row.setTag(holder);
            }
            else
            {
                holder = (ImageHolder)row.getTag();
            }
            Dresses picture = data.get(position);
            byte[] outImage=picture._image;
            ByteArrayInputStream imageStream = new ByteArrayInputStream(outImage);
            Bitmap theImage = BitmapFactory.decodeStream(imageStream);
            holder.imgIcon.setImageBitmap(theImage);
            return row;
        }
        static class ImageHolder
        {
            ImageView imgIcon;
            TextView txtTitle;
        }
    }

