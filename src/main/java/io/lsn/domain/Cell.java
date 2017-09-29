package io.lsn.domain;

public class Cell {

    private String value;
    private Long col;
    private Long row;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getCol() {
        return col;
    }

    public void setCol(Long col) {
        this.col = col;
    }

    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }
}
