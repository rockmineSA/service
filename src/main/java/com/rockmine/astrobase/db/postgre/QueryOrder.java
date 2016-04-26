package com.rockmine.astrobase.db.postgre;

/**
 * Created by kkedari on 4/23/16.
 */
public class QueryOrder {

    private String column;

    private String type;

    public QueryOrder(String column, String type) {
        this.column = column;
        this.type = type;
    }
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
