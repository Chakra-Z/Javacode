package WarehouseManagement.storage;

import WarehouseManagement.goods.Goods;
import WarehouseManagement.goods.GoodsList;

import java.util.Scanner;

public class AddStorage implements IStorage {
    @Override
    public void work(GoodsList goodsList) {
        System.out.println("请添加货物");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加货物名称：");
        String goodsName = scanner.next();
        System.out.println("请输入货物单价：");
        float goodsPrice = scanner.nextFloat();
        System.out.println("请输入货物类型：");
        String goodsStyle = scanner.next();
        System.out.println("请输入添加的货物数量：");
        int goodsNumber = scanner.nextInt();

        Goods goods = new Goods(goodsName, goodsPrice,goodsStyle,goodsNumber);
        goodsList.setGoods(goodsList.getSize(),goods);
        goodsList.setSize(goodsList.getSize()+1);
    }
}
