package io.lsn.controller;

import io.lsn.domain.UploadConfirmation;
import io.lsn.service.DictionaryImportIntoDBService;
import io.lsn.service.DictionaryService;
import io.lsn.service.DictionaryUploadToLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.annotation.MultipartConfig;
import java.io.IOException;

@RestController
@MultipartConfig(fileSizeThreshold = 20971520)
public class DictionaryController {

    @Autowired
    DictionaryUploadToLocationService dictionaryUploadToLocationService;

    @Autowired
    DictionaryService dictionaryService;
    @Autowired
    DictionaryImportIntoDBService dictionaryImportIntoDBService;

    @RequestMapping(value = "/dictionary/uploadToLocation", method = RequestMethod.POST)
    public ResponseEntity<UploadConfirmation> uploadToLocation(@RequestParam("dictionary") MultipartFile multipartFile) throws IOException {

        return new ResponseEntity<>(dictionaryUploadToLocationService.uploadFileToLocation(multipartFile), HttpStatus.OK);

    }

    @RequestMapping(value = "/dictionary/importIntoDB", method = RequestMethod.POST)
    public ResponseEntity<UploadConfirmation> importIntoDB(@RequestParam("dictionary") MultipartFile multipartFile) {

        return new ResponseEntity<>(dictionaryImportIntoDBService.importFileIntoDB(multipartFile), HttpStatus.OK);

    }

    @RequestMapping(value = "/dictionary/export", method = RequestMethod.GET)
    public ResponseEntity<ExportConfirmation> exportDictionary(@RequestParam("dictionary") String dictionaryName) throws IOException
    {
        return new ResponseEntity<ExportConfirmation>(dictionaryService.exportDictionary(dictionaryName),HttpStatus.OK);
    }


    @RequestMapping(value = "/home")
    public String home()
    {
        return "hello";
    }

//    @RequestMapping(value = "/dictionary/importToDB", method = RequestMethod.POST)
//    public ResponseEntity importDictionary(@RequestBody ImportRequest importRequest) {
//
//    }
//
//    @RequestMapping(value = "/dictionary/exportToXlsx", method = RequestMethod.GET)
//    public ResponseEntity importDictionary(@RequestParam ) {
//
//    }

}
