package com.ctgu.wh.utils;

import android.graphics.Bitmap;

public class ImagePiece
{
    private int index ;//图片的索引
    private Bitmap bitmap ;//指向某一片图片

    public ImagePiece()
    {
    }

    public ImagePiece(int index, Bitmap bitmap)
    {
        this.index = index;
        this.bitmap = bitmap;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap)
    {
        this.bitmap = bitmap;
    }

    @Override
    public String toString()
    {
        return "ImagePiece [index=" + index + ", bitmap=" + bitmap + "]";
    }

}
