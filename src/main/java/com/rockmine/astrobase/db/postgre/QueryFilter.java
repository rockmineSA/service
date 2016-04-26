package com.rockmine.astrobase.db.postgre;

/**
 * Created by kkedari on 4/22/16.
 */
public class QueryFilter {

    private String table ;

    private String column;

    private String operator;

    private Object value;

    public QueryFilter(String table, String column, String operator, Object value) {
        this.table = table;
        this.column = column;
        this.operator = operator;
        this.value = value;
    }
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
