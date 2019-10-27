package WarehouseManagement.goods;

public class Goods {
    private String goodsName;
    private float goodsPrice;
    private String goodsStyle;
    private int goodsNumber;

    public Goods(String goodsName, float goodsPrice, String goodsStyle, int goodsNumber) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsStyle = goodsStyle;
        this.goodsNumber = goodsNumber;
    }
}
