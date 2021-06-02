package br.com.rocha.testejava.designPattenerns.builder;

import lombok.Data;

@Data
public class QuerySelect {
    private String table;
    private String where;
    private String orderBy;
    private String order;
    private int skip;
    private int take;


    @Override
    public String toString() {
        return """
                SELECT * FROM \
                %s WHERE %s \
                LIMIT %d, %d \
                ORDER BY %s %s
                """.formatted(table, where, skip, take, orderBy, order);
    }
}
