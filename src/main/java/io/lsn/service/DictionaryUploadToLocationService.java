package io.lsn.service;

import io.lsn.domain.UploadConfirmation;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Service
public class DictionaryUploadToLocationService {

    private static String dataFileName = "";
    private static Path uploadDirectory = null;

    public UploadConfirmation uploadFileToLocation (MultipartFile multipartFile) throws IOException {

        UploadConfirmation uploadConfirmation = new UploadConfirmation();

        if(!multipartFile.getOriginalFilename().endsWith(".xlsx")) {
            uploadConfirmation.setFileName(multipartFile.getOriginalFilename());
            uploadConfirmation.setOperationDate(LocalDateTime.now());
            uploadConfirmation.setUploadMessage("Wybrany plik nie jest arkuszem 'xlsx'.");
            return uploadConfirmation;
        }

        if(multipartFile.isEmpty()) {
            uploadConfirmation.setFileName(multipartFile.getOriginalFilename());
            uploadConfirmation.setOperationDate(LocalDateTime.now());
            uploadConfirmation.setUploadMessage("Wybrany plik nie istnieje, spróbuj ponownie.");
            return uploadConfirmation;
        }

        dataFileName = multipartFile.getOriginalFilename();
        uploadDirectory = Paths.get(new File("src/main/resources/uploaded/" + dataFileName)
                .getAbsoluteFile().toString());

        byte[] fileBytes = multipartFile.getBytes();
        Files.write(uploadDirectory, fileBytes);
        uploadConfirmation.setOperationDate(LocalDateTime.now());

        uploadConfirmation.setFileName(dataFileName);
        uploadConfirmation.setFileOutputLocation(uploadDirectory.toString());
        uploadConfirmation.setFileSizeBytes(multipartFile.getSize());
        uploadConfirmation.setUploadMessage("Brawo, zapisano plik!");

        return uploadConfirmation;

    }

}
