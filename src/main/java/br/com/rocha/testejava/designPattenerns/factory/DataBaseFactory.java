package br.com.rocha.testejava.designPattenerns.factory;

public class DataBaseFactory {
    public static DataBase createDataBase(DialectDataBase dialect) {
        return dialect.dataBase();
    }
}
