package br.com.rocha.testejava.designPattenerns.factory;

public class DataBaseTest {
    public static void main(String[] args) {

        DataBase dataBase = DataBaseFactory.createDataBase(DialectDataBase.MYSQL);
        System.out.println(dataBase.getConnection());
    }
}
