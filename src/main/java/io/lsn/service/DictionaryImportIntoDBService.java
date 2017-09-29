package io.lsn.service;

import io.lsn.domain.FileChecker;
import io.lsn.domain.UploadConfirmation;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DictionaryImportIntoDBService {

    public UploadConfirmation importFileIntoDB (MultipartFile multipartFile) {

        UploadConfirmation uploadConfirmation = new UploadConfirmation();

        if(FileChecker.checkGivenFile(multipartFile, uploadConfirmation)) {
            return uploadConfirmation;
        }



        return uploadConfirmation;

    }

}
