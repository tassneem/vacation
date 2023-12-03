package org.example.utils;

import lombok.AllArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Component

public class JasperReportUtiles {


    private final DataSource dataSource;
    private static String reportName="employee";
   // private static String subName="employee_Arabic";

    public void generateJasper(HttpServletResponse response, Map<String, Object> parameters, List<String> subReportName,ReportFormat format) {
        Connection connection = null;

        try {

            connection = dataSource.getConnection();
            File mainReport = new File(new File(reportName + ".jasper").getAbsolutePath());

            if (!mainReport.exists()) {
                ClassPathResource classPathResource = new ClassPathResource("jasperReport/" + reportName + ".jrxml");
                JasperReport jasperReport = JasperCompileManager.compileReport(classPathResource.getInputStream());
                JRSaver.saveObject(jasperReport, reportName + ".jasper");
            }
            if (subReportName != null) {
                for (String subName : subReportName) {
                    File subReport = new File(new File(subName + ".jasper").getAbsolutePath());
                    if (!subReport.exists()) {
                        ClassPathResource subClassPathResource = new ClassPathResource("jasperReport/" + subName + ".jrxml");
                        JasperReport subJasperReport = JasperCompileManager.compileReport(subClassPathResource.getInputStream());
                        JRSaver.saveObject(subJasperReport, subName + ".jasper");
                    }
                    parameters.put("subReportJasperFile", subReport);
                }
            }


            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(String.valueOf(mainReport), parameters, connection);

            // Set up exporter based on the chosen format
            if (ReportFormat.PDF.equals(format)) {
                // Set up response for PDF
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition", "attachment; filename=" + reportName + ".pdf");

                // Other PDF-related configurations

                // Export the report to PDF
                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));
                exporter.exportReport();
            } else if (ReportFormat.DOCX.equals(format)){
                // Set up response for Word document
                response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
                response.setHeader("Content-Disposition", "attachment; filename=" + reportName + ".docx");

                // Other Word-related configurations

                // Export the report to Word
                JRDocxExporter exporter = new JRDocxExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));
                exporter.exportReport();
            }
            else if (ReportFormat.EXCEL.equals(format)) {
                // Excel-related configurations...
                response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
                response.setHeader("Content-Disposition", "attachment; filename=" + reportName + ".xlsx");

                // Export the report to Excel
                JRXlsxExporter exporter = new JRXlsxExporter();
                // Configure Excel exporter settings
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));
                exporter.exportReport();
            }
            else {
                // Handle unsupported format
                throw new IllegalArgumentException("Unsupported format: " + format);
            }
            // Close the database connection
            connection.close();

            System.out.println("Report generation successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}




