package br.com.rocha.testejava.designPattenerns.builder;

public class QueryBuilderSelect {
    private QuerySelect querySelect;

    public QueryBuilderSelect(String table) {
        this.querySelect = new QuerySelect();
        this.querySelect.setTable(table);
    }

    public QueryBuilderSelect() {
        this.querySelect = new QuerySelect();
    }

    public QueryBuilderSelect table(String table) {
        this.querySelect.setTable(table);
        return this;
    }

    public QueryBuilderSelect where(String where) {
        this.querySelect.setWhere(where);
        return this;
    }

    public QueryBuilderSelect orderBy(String orderBy, String order) {
        this.querySelect.setOrderBy(orderBy);
        this.querySelect.setOrder(order);
        return this;
    }

    public QueryBuilderSelect skip(int skip) {
        this.querySelect.setSkip(skip);
        return this;
    }

    public QueryBuilderSelect take(int take) {
        this.querySelect.setTake(take);
        return this;
    }

    public String builder() {
        return this.querySelect.toString();
    }

}
