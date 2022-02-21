package com.example.gridview;

public class ImageModel {
    private String img_name;
    private int imgid;
    public ImageModel(String img_name,int imgid){
        this.img_name=img_name;
        this.imgid=imgid;
    }
    public String getImg_name(){
        return img_name;
    }
    public void setImg_name(String img_name){
        this.img_name=img_name;
    }
    public int getImgid(){
        return imgid;
    }
    public void setImgid(int imgid){
        this.imgid=imgid;
    }
}
