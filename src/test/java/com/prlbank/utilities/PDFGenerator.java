package com.gmibank.utilities;
//import com.prlbank.pojos.Country;
//import com.prlbank.pojos.Customer;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class PDFGenerator {


//    public static void pdfGenerator(String header, String fileName){
//
//        Document document = new Document();
//        String pdf_path = fileName;
//        String pdf_title = header;
//        List<String> headers = new ArrayList<String>();
//        headers.add("Applicant");
//        headers.add("SSN");
//        headers.add("Country");
//        headers.add("State");
//        headers.add("Zip code");
//
//        try{
//
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));
//
//            document.open(); // once dosyanin acilmasi lazim
//
//            document.add(new Paragraph(pdf_title));  // sonra basligin yerlestirilmesi
//
//            PdfPTable table = new PdfPTable(headers.size());
//
//            table.setWidthPercentage(110);  // baslik ile pdf arasindaki mesafe
//            table.setSpacingBefore(12);
//            table.setSpacingAfter(12);
//            float [] colWidth = {2,2,2,2,2};  // sutun genisligi
//            table.setWidths(colWidth);
//
//            for (int i=0; i<headers.size();i++){
//                PdfPCell cellHeader = new PdfPCell(new Paragraph("    "+headers.get(i)));
//                table.addCell(cellHeader);
//
//            }
//
//
//
//            document.add(table); // en son asamada table documentin icine atilacak
//
//            document.close();
//
//            writer.close();
//
//        }
//
//        catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//    public static void pdfGeneratorRowsAndCells(String header, String fileName){
//
//
//    }
//
//
//
//    public static void pdfGeneratorRowsAndCellsWithList2(String header, List <Customer> list, String fileName){
//
//        Document document = new Document();
//        String pdf_path = fileName;
//        String pdf_title = header;
//        //  String logo_path = "/Users/mk201/OneDrive/Desktop/logo.jpg";
//        List<String> headers = new ArrayList<String>();
//        headers.add("Applicants");
//        headers.add("SSNs");
//        headers.add("Countries");
//        headers.add("States");
//        headers.add("Zip codes");
//
//
//
//        try{
//
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));
//
//            document.open();
//
//            document.add(new Paragraph("                                            "+pdf_title));
//
//            PdfPTable table = new PdfPTable(5);
//            table.setWidthPercentage(110);
//            table.setSpacingBefore(25);
//            table.setSpacingAfter(25);
//            float [] colWidth = {2,2,2,2,2};
//            table.setWidths(colWidth);
//
//
//
//            for(int i=0;i<headers.size();i++) {
//
//                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
//                table.addCell(cell1);
//
//            }
//
//            table.setHeaderRows(list.size());
//
//            for(int i=0;i<list.size();i++ ) {
//
//                table.addCell(list.get(i).getFirstName());
//                table.addCell(list.get(i).getSsn());
//                table.addCell(list.get(i).getCountry().getName());
//                table.addCell(list.get(i).getState());
//                table.addCell(list.get(i).getZipCode());
//
//            }
//            document.add(table);
//
//            //       document.add(Image.getInstance(logo_path));
//            document.close();
//
//            writer.close();
//
//        }
//
//        catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//        //pdfGenerator("               pdf_ders","deneme.pdf");
//        //  pdfGeneratorRowsAndCells("pdf2","pdf_ders2.pdf");
//
//
//
//
//        List <Customer> list = new ArrayList<>();
//        Country country = new Country();
//        country.setName("USA");
//        Customer customer = new Customer();
//        customer.setFirstName("Emine");
//        customer.setState("MA");
//        customer.setSsn("202020202");
//        customer.setZipCode("02120");
//        customer.setCountry(country);
//
//        list.add(customer);
//
//        String header = "Information";
//        String fileName ="some.pdf";
//
//        pdfGeneratorRowsAndCellsWithList2(header,list,fileName);
//
//
//
//
//    }
//
//    public static void pdfGeneratorRowsAndCellsWithList(String header, List <Customer> list, String fileName){​
//        Document document = new Document();
//        String pdf_path = fileName;
//        String pdf_title = header;
//
//        List<String> headers = new ArrayList<String>();
//        headers.add("Firstname");
//        headers.add("LastName");
//        headers.add("Email");
//        headers.add("City");
//        headers.add("SSN Number");
//
//
//
//        try{
//
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));
//
//            document.open();
//            document.add(new Paragraph("                                     "+pdf_title));​
//            PdfPTable table = new PdfPTable(5);
//            table.setWidthPercentage(110);
//            table.setSpacingBefore(25);
//            table.setSpacingAfter(25);
//            float [] colWidth = {2,2,2,2,2};
//            table.setWidths(colWidth);
//
//
//
//            for(int i=0;i<headers.size();i++) {
//                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
//                table.addCell(cell1);
//
//            }
//
//            table.setHeaderRows(list.size());
//
//            for(int i=0;i<list.size();i++ ) {
//
//                table.addCell(list.get(i).getFirstName());
//                table.addCell(list.get(i).getLastName());
//                table.addCell(list.get(i).getEmail());
//                table.addCell(list.get(i).getCity());
//                table.addCell(list.get(i).getSsn());
//
//            }
//            document.add(table);
//
//            document.close();
//
//            writer.close();
//
//        }
//
//        catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }
//
//
}