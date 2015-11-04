package com.example.administrator.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 4/11/2015.
 */
public class ProductAdapter extends ArrayAdapter<ProductItem>
{

    public ProductAdapter(Context context, List<ProductItem> objects)
    {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list, null, false);

        TextView pnameTextView = (TextView)view.findViewById(R.id.item_pName);
        TextView priceTextView = (TextView)view.findViewById(R.id.item_price);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_image);
        TextView locationTextView = (TextView)view.findViewById(R.id.item_location);

        ProductItem productItem = getItem(position);

        pnameTextView.setText(productItem.pName);
        priceTextView.setText(productItem.price);
        imageView.setImageResource(productItem.imaageResID);
        locationTextView.setText(productItem.location);
        return view;
    }
}
