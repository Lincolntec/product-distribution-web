package com.ubs.teste.apiweb.dto;

public class DistribuitionDTO {

    private Integer storyQuantity;

    private Integer biggerProduct;

    private Integer smallerProduct;

    private Integer totalQuantityProducts;

    private Integer companeisWhitMoreProducts;

    private Integer companiesWithFewerProducts;

    private Integer price;

    private Integer higherPrice;
    private Integer lowerPrice;

    public Integer getStoryQuantity() {
        return storyQuantity;
    }

    public void setStoryQuantity(Integer storyQuantity) {
        this.storyQuantity = storyQuantity;
    }

    public Integer getBiggerProduct() {
        return biggerProduct;
    }

    public void setBiggerProduct(Integer biggerProduct) {
        this.biggerProduct = biggerProduct;
    }

    public Integer getSmallerProduct() {
        return smallerProduct;
    }

    public void setSmallerProduct(Integer smallerProduct) {
        this.smallerProduct = smallerProduct;
    }

    public Integer getTotalQuantityProducts() {
        return totalQuantityProducts;
    }

    public void setTotalQuantityProducts(Integer totalQuantityProducts) {
        this.totalQuantityProducts = totalQuantityProducts;
    }

    public Integer getCompaneisWhitMoreProducts() {
        return companeisWhitMoreProducts;
    }

    public void setCompaneisWhitMoreProducts(Integer companeisWhitMoreProducts) {
        this.companeisWhitMoreProducts = companeisWhitMoreProducts;
    }

    public Integer getCompaniesWithFewerProducts() {
        return companiesWithFewerProducts;
    }

    public void setCompaniesWithFewerProducts(Integer companiesWithFewerProducts) {
        this.companiesWithFewerProducts = companiesWithFewerProducts;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHigherPrice() {
        return higherPrice;
    }

    public void setHigherPrice(Integer higherPrice) {
        this.higherPrice = higherPrice;
    }

    public Integer getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(Integer lowerPrice) {
        this.lowerPrice = lowerPrice;
    }


}
