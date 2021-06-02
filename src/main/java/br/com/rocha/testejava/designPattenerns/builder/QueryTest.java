package br.com.rocha.testejava.designPattenerns.builder;

public class QueryTest {
    public static void main(String[] args) {
        String sql = new QueryBuilderSelect("produtos")
                        .where("produto.id = 12")
                        .orderBy("produto.id", "ASC")
                        .skip(0)
                        .take(2)
                        .builder();

        System.out.println(sql);
    }
}
