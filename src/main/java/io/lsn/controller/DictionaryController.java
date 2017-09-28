package io.lsn.controller;

import io.lsn.domain.UploadConfirmation;
import io.lsn.service.DictionaryToLocationUploadService;
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
    DictionaryToLocationUploadService dictionaryToLocationUploadService;

    @RequestMapping(value = "/dictionary/uploadToLocation", method = RequestMethod.POST)
    public ResponseEntity<UploadConfirmation> uploadToLocation(@RequestParam("dictionary") MultipartFile multipartFile) throws IOException {

        return new ResponseEntity<>(dictionaryToLocationUploadService.uploadFileToLocation(multipartFile), HttpStatus.OK);

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
