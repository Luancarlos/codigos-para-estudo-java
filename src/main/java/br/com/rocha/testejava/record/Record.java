package br.com.rocha.testejava.record;

public class Record {
    public static void main(String[] args) {
        String name = """
                Macbook pro
                """;
        ProductRecord productRecord = new ProductRecord(name, 12000);
        System.out.println(productRecord.name());
    }
}
