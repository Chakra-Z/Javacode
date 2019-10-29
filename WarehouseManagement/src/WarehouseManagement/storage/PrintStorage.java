package WarehouseManagement.storage;

import WarehouseManagement.goods.GoodsList;

public class PrintStorage implements IStorage {
    @Override
    public void work(GoodsList goodsList) {
        System.out.println("输出所有货物信息");
        for (int i = 0; i < goodsList.getSize(); i++) {
            System.out.println(goodsList.getGoods(i));
        }
        System.out.println("共计 " +goodsList.getSize()+ " 种货物");
    }
}
