package com.example.administrator.listview;

/**
 * Created by Administrator on 4/11/2015.
 */
public class ProductItem
{
    String pName, price, location, weblink;
    int imaageResID;

    public ProductItem(String pName, String price, int imaageResID, String location, String weblink)
    {
        this.pName = pName;
        this.price = price;
        this.imaageResID = imaageResID;
        this.location = location;
        this.weblink = weblink;
    }
}
