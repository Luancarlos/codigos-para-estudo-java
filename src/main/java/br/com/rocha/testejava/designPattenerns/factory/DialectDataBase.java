package br.com.rocha.testejava.designPattenerns.factory;

public enum DialectDataBase {
    MYSQL {
        @Override
        public DataBase dataBase() {
            return new Mysql();
        }
    },
    POSTGRESQL {
        @Override
        public DataBase dataBase() {
             return new Postgresql();
        }
    },
    MONGODB {
        @Override
        public DataBase dataBase() {
            return new Mongodb();
        }
    };

    public abstract DataBase dataBase();
}
