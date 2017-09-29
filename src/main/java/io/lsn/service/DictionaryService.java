package io.lsn.service;

import io.lsn.controller.ExportConfirmation;
import io.lsn.dao.DictionaryDao;
import io.lsn.domain.Cell;
import io.lsn.domain.Dictionary;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Comparator;

import static java.util.Comparator.comparing;

@Service
public class DictionaryService {

    @Autowired
    private DictionaryDao dictionaryDao;

    public ExportConfirmation exportDictionary(String dictionaryName){

        Dictionary dictionary = dictionaryDao.getDictionary(dictionaryName);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();


        Row headerRow = sheet.createRow(0);


        dictionary.getListOfCells().stream()
                .filter(cell -> cell.getRow()==0)
                .sorted(comparing(Cell::getCol))
                .forEach(cell -> headerRow.createCell(cell.getRow().intValue()));

        File file = new File("src/main/resources/uploaded/");


        return new ExportConfirmation();
    }
}
