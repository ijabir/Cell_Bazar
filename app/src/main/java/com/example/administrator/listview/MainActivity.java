package com.example.administrator.listview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.list);
        ProductItem tissot = new ProductItem("Tissot","42,500 Taka",R.drawable.watch, "Dhaka", "http://www.ekhanei.com/en/dhaka-city/pallabi/watches-and-jewellery/tissot-ladies-watch-12800128");
        ProductItem sBracelet = new ProductItem("Sports Bracelet Watch","350 Taka",R.drawable.sbracelet, "Dhaka","http://www.ekhanei.com/en/dhaka-city/dhanmondi/watches-and-jewellery/sports-bracelet-watch-12799615");
        ProductItem bag = new ProductItem("Yeso f110 backpack bag","1650 Taka",R.drawable.bag, "Dhaka", "http://www.ekhanei.com/en/dhaka-city/gulshan/bags-and-shoes/yeso-f110-backpack-bag-10686909");

        final ArrayList<ProductItem> productItems = new ArrayList<>();

        productItems.add(tissot);
        productItems.add(sBracelet);
        productItems.add(bag);

        ProductAdapter nameAdapter =
                new ProductAdapter(this, productItems);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                ProductItem productItem = productItems.get(i);
                String weblink = productItem.weblink;
                Uri webPage = Uri.parse(weblink);
                Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
                startActivity(intent);

                //Toast.makeText(MainActivity.this, "I Clicked name " + pName, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
