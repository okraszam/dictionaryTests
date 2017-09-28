package io.lsn.domain;

import java.time.LocalDateTime;

public class UploadConfirmation {

    private String fileName;
    private String fileOutputLocation;
    private Long fileSizeBytes;
    private LocalDateTime operationDate;
    private String uploadMessage;

    public UploadConfirmation() {
    }

    public UploadConfirmation(String fileName, String fileOutputLocation, Long fileSizeBytes, LocalDateTime operationDate, String uploadMessage) {
        this.fileName = fileName;
        this.fileOutputLocation = fileOutputLocation;
        this.fileSizeBytes = fileSizeBytes;
        this.operationDate = operationDate;
        this.uploadMessage = uploadMessage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOutputLocation() {
        return fileOutputLocation;
    }

    public void setFileOutputLocation(String fileOutputLocation) {
        this.fileOutputLocation = fileOutputLocation;
    }

    public Long getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public String getUploadMessage() {
        return uploadMessage;
    }

    public void setUploadMessage(String uploadMessage) {
        this.uploadMessage = uploadMessage;
    }
}
