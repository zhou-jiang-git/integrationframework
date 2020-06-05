package com.zhoujiang.integrationframework.domain;

public class goods {
    private Integer goodsId;

    private Integer goodsCategory;

    private String goodsName;

    private Integer goodsStatus;

    private Integer goodsBussinessid;

    private Double goodsPrice;

    private Integer goodsCounts;

    private String goodsIntro;

    private Double goodsDiscount;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(Integer goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsBussinessid() {
        return goodsBussinessid;
    }

    public void setGoodsBussinessid(Integer goodsBussinessid) {
        this.goodsBussinessid = goodsBussinessid;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsCounts() {
        return goodsCounts;
    }

    public void setGoodsCounts(Integer goodsCounts) {
        this.goodsCounts = goodsCounts;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }
}