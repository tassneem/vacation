package org.example.utils;

import lombok.AllArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import org.springframework.stereotype.Component;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;


import java.util.List;
@AllArgsConstructor
@Component
public class JasperReportUtiles {
    public void gerarJasper() {
        try {
            // Set up a JDBC connection (replace with your database details)
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vacation", "postgres", "123456");

            // Load the JasperReport template (replace with your .jrxml or .jasper file)
            JasperReport jasperReport = JasperCompileManager.compileReport("jasperReport/employee_English.jrxml");

            // Set up parameters (if your report requires any)
            Map<String, Object> parameters = new HashMap<>();

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            // Export the report to PDF (you can change the format as needed)
            exportToPDF(jasperPrint, "C:\\Users\\Tassneem\\Desktop\\senior\\project.pdf");

            // Close the database connection
            connection.close();

            System.out.println("Report generation successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exportToPDF(JasperPrint jasperPrint, String outputPath)  {

        try {
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPath);
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

}




