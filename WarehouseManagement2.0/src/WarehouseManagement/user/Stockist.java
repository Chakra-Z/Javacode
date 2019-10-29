package WarehouseManagement.user;

import WarehouseManagement.storage.AddStorage;
import WarehouseManagement.storage.IStorage;
import WarehouseManagement.storage.PrintStorage;

public class Stockist extends User {
    public Stockist(String name, String ID) {
        super(name, ID);
        iStorages = new IStorage[] {
                new AddStorage(),
                new PrintStorage()
        };
    }
}
