package br.com.rocha.testejava.designPattenerns.factory;

public interface DataBase {
    String getConnection();
}


class Mysql implements DataBase {

    @Override
    public String getConnection() {
        return "mysql://connection";
    }
}

class Postgresql implements DataBase {

    @Override
    public String getConnection() {
        return "postgresql://connection";
    }
}

class Mongodb implements DataBase {

    @Override
    public String getConnection() {
        return "mongodb://connection";
    }
}

