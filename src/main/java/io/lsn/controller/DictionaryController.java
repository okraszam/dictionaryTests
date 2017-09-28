package io.lsn.controller;

import io.lsn.domain.ImportRequest;
import io.lsn.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RestController
public class DictionaryController {

    private final static String uploadDirectory = "sciezka";

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping(value = "/dictionary/uploadToLocation", method = RequestMethod.POST)
    public void importDictionary(@RequestBody ImportRequest importRequest) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(this.uploadDirectory + "/" + importRequest.getFileName());
        
    }

    @RequestMapping(value = "/home")
    public String home()
    {
        return "hello";
    }
//    @RequestMapping(value = "/dictionary/downloadFromLocation", method = RequestMethod.GET)
//    public ResponseEntity importDictionary(@RequestParam) {
//
//    }
//
//    @RequestMapping(value = "/dictionary/importToDB", method = RequestMethod.POST)
//    public ResponseEntity importDictionary(@RequestBody ImportRequest importRequest) {
//
//    }
//
//    @RequestMapping(value = "/dictionary/exportToXlsx", method = RequestMethod.GET)
//    public ResponseEntity importDictionary(@RequestParam ) {
//
//    }
//
//    @RequestMapping(value = "/dictionary/import", method = RequestMethod.GET)
//    public ResponseEntity importDictionary(@RequestParam ) {
//
//    }

}
