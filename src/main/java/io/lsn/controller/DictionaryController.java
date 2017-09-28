package io.lsn.controller;

import io.lsn.domain.ImportRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DictionaryController {

    @RequestMapping(value = "/dictionary/uploadToLocation", method = RequestMethod.POST)
    public ResponseEntity importDictionary(@RequestBody ImportRequest importRequest) {

    }

    @RequestMapping(value = "/dictionary/downloadFromLocation", method = RequestMethod.GET)
    public ResponseEntity importDictionary(@RequestParam) {

    }

    @RequestMapping(value = "/dictionary/importToDB", method = RequestMethod.POST)
    public ResponseEntity importDictionary(@RequestBody ImportRequest importRequest) {

    }

    @RequestMapping(value = "/dictionary/exportToXlsx", method = RequestMethod.GET)
    public ResponseEntity importDictionary(@RequestParam ) {

    }

    @RequestMapping(value = "/dictionary/import", method = RequestMethod.GET)
    public ResponseEntity importDictionary(@RequestParam ) {

    }

}
