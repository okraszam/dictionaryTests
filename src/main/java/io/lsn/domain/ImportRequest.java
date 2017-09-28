package io.lsn.domain;

public class ImportRequest {
    private Long headerRowNumber;
    private String fileName;


    public Long getHeaderRowNumber() {
        return headerRowNumber;
    }

    public void setHeaderRowNumber(Long headerRowNumber) {
        this.headerRowNumber = headerRowNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
