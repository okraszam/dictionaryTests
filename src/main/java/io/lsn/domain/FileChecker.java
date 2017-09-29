package io.lsn.domain;

import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

public class FileChecker {

    public static Boolean checkGivenFile(MultipartFile multipartFile, UploadConfirmation uploadConfirmation) {

        if(
        checkFileType(multipartFile, uploadConfirmation) ||
        checkFileSize(multipartFile, uploadConfirmation)
                ) {
            return true;
        } else {
            return false;
        }

    }

    private static Boolean checkFileType(MultipartFile multipartFile, UploadConfirmation uploadConfirmation) {

        if (!multipartFile.getOriginalFilename().endsWith(".xlsx")) {
            uploadConfirmation.setFileName(multipartFile.getOriginalFilename());
            uploadConfirmation.setOperationDate(LocalDateTime.now());
            uploadConfirmation.setUploadMessage("Wybrany plik nie jest arkuszem 'xlsx'.");
            return true;
        } else {
            return false;
        }

    }

    private static boolean checkFileSize(MultipartFile multipartFile, UploadConfirmation uploadConfirmation) {

        if(multipartFile.isEmpty()) {
            uploadConfirmation.setFileName(multipartFile.getOriginalFilename());
            uploadConfirmation.setOperationDate(LocalDateTime.now());
            uploadConfirmation.setUploadMessage("Wybrany plik nie istnieje, spróbuj ponownie.");
            return true;
        } else {
            return false;
        }

    }

}