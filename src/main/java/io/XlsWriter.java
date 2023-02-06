package io;

import model.Statistics;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    private XlsWriter() {
    }

    public static void writeXlsStatistics(List<Statistics> statisticsList, String filePath) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet statisticsSheet = workbook.createSheet("Статистика");
        statisticsSheet.setColumnWidth(0, 6000);
        statisticsSheet.setColumnWidth(1, 6000);
        statisticsSheet.setColumnWidth(2, 6000);
        statisticsSheet.setColumnWidth(3, 6000);
        statisticsSheet.setColumnWidth(4, 6000);

        Font headerFont = workbook.createFont();
        headerFont.setFontName("Arial");
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 12);
        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);
        headerStyle.setWrapText(true);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);



        int rowNumber = 0;
        Row headerRow = statisticsSheet.createRow(rowNumber++);
        Cell profileCellHeader = headerRow.createCell(0);
        profileCellHeader.setCellValue("Профиль обучения");
        profileCellHeader.setCellStyle(headerStyle);
        Cell avgScoreCellHeader = headerRow.createCell(1);
        avgScoreCellHeader.setCellValue("Средний балл за экзамены по профилю");
        avgScoreCellHeader.setCellStyle(headerStyle);
        Cell numberOfStudentsCellHeader = headerRow.createCell(2);
        numberOfStudentsCellHeader.setCellValue("Количество студентов по профилю");
        numberOfStudentsCellHeader.setCellStyle(headerStyle);
        Cell numberOfUniversitiesCellHeader = headerRow.createCell(3);
        numberOfUniversitiesCellHeader.setCellValue("Количество университетов по профилю");
        numberOfUniversitiesCellHeader.setCellStyle(headerStyle);
        Cell universitiesCellHeader = headerRow.createCell(4);
        universitiesCellHeader.setCellValue("Университеты");
        universitiesCellHeader.setCellStyle(headerStyle);

        for (Statistics statistics : statisticsList) {
            Row dataRow = statisticsSheet.createRow(rowNumber++);
            Cell profileCell = dataRow.createCell(0);
            profileCell.setCellValue(statistics.getProfile().getProfileName());
            Cell avgScoreCell = dataRow.createCell(1);
            avgScoreCell.setCellValue(statistics.getAvgExamScore());
            Cell numberOfStudentsCell = dataRow.createCell(2);
            numberOfStudentsCell.setCellValue(statistics.getNumberOfStudents());
            Cell numberOfUniversitiesCell = dataRow.createCell(3);
            numberOfUniversitiesCell.setCellValue(statistics.getNumberOfUniversities());
            Cell universitiesCell = dataRow.createCell(4);
            universitiesCell.setCellValue(statistics.getUniversityNames());
        }

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        }
    }
}
