package io.lsn.service;

import io.lsn.domain.UploadConfirmation;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DictionaryImportIntoDBService {

    public UploadConfirmation importFileIntoDB (MultipartFile multipartFile) {

        UploadConfirmation uploadConfirmation = new UploadConfirmation();



        return uploadConfirmation;

    }

}
