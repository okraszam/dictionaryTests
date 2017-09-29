package io.lsn.domain;

import java.util.List;

public class Dictionary {

    private String dictionaryName;
    private Long rowNumber;
    private Long colNumber;
    private Long currentRow;
    private Long currentCol;
    private List<Cell> listOfCells;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public List<Cell> getListOfCells() {
        return listOfCells;
    }

    public void setListOfCells(List<Cell> listOfCells) {
        this.listOfCells = listOfCells;
    }

    public Long getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Long getColNumber() {
        return colNumber;
    }

    public void setColNumber(Long colNumber) {
        this.colNumber = colNumber;
    }

    public Long getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(Long currentRow) {
        this.currentRow = currentRow;
    }

    public Long getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(Long currentCol) {
        this.currentCol = currentCol;
    }
}
