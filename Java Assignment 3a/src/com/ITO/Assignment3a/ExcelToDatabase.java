package com.ITO.Assignment3a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToDatabase 
{
	public static void main(String[] args) 
	{
		try 
		{
			ExcelToDatabase mainObj = new ExcelToDatabase();
			ArrayList<DetailsInXl> detailsObjList = mainObj.readData();
			mainObj.writeData(detailsObjList);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {
		try {
			
			Properties pr = new Properties();
			FileReader reader = new FileReader("Details.properties");
			pr.load(reader);
			
			Class.forName(pr.getProperty("driver_class_name"));
			//String password = pr.getProperty("password");
			Connection obj = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("username"), pr.getProperty("password") );
			return obj;
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("JDBC Connection Failed");
			return null;
		}

	}
	
	
	private void writeData(ArrayList detailsObjList) {
		try {

			Connection connection = createConnection();
			PreparedStatement prst = connection.prepareStatement("INSERT INTO firstdb.BusinessPartner ( business_partner_id, business_partner_name, business_partner_code, contact_name, address1,address2, city, province, country, postal_code, parent_company, toll_free_number, phone, phone_extension, fax, website_url, payment_condition, gl_number, driver_min_age, api_enabled, status, one_way_free_paid_by, country_code) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			for (DetailsInXl detailsInXlObj : detailsObjList) {

				prst.setInt(1, detailsInXlObj.getBusiness_partner_id());
				prst.setString(2, detailsInXlObj.getBusiness_partner_name());
				prst.setString(3, detailsInXlObj.getBusiness_partner_code());
				prst.setString(4, detailsInXlObj.getContact_name());
				prst.setString(5, detailsInXlObj.getAddress1());
				prst.setString(6, detailsInXlObj.getAddress2());
				prst.setString(7, detailsInXlObj.getCity());
				prst.setString(8, detailsInXlObj.getProvince());
				prst.setString(9, detailsInXlObj.getCountry());
				prst.setString(10, detailsInXlObj.getPostal_code());
				prst.setString(11, detailsInXlObj.getParent_company());
				prst.setString(12, detailsInXlObj.getToll_free_number());
				prst.setInt(13, detailsInXlObj.getPhone());
				prst.setString(14, detailsInXlObj.getPhone_extension());
				prst.setString(15, detailsInXlObj.getFax());
				prst.setString(16, detailsInXlObj.getWebsite_url());
				prst.setString(17, detailsInXlObj.getPayment_condition());
				prst.setString(18, detailsInXlObj.getGl_number());
				prst.setInt(19, detailsInXlObj.getDriver_min_age());
				prst.setString(20, detailsInXlObj.getApi_enabled());
				prst.setString(21, detailsInXlObj.getStatus());
				prst.setString(22, detailsInXlObj.getOne_way_free_paid_by());
				prst.setString(23, detailsInXlObj.getCountry_code());
				
				prst.executeUpdate();
			}

			connection.close();

		} catch (SQLException sqlException) {
			System.out.println("Exception occured while wrtiting data into database.");
			try {
				throw sqlException;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private ArrayList readData() {
		ArrayList detailsObjList = new ArrayList();
		try {

			Properties prop = new Properties();
			FileReader reader = new FileReader("Details.properties");
			prop.load(reader);

			FileInputStream file = new FileInputStream(new File(prop.getProperty("ExcelFilePath")));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);

			Row row;
		

			// To iterate through each and every row in the excel sheet

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				
				// Instance creation of CustApptSched class for each and every row
				
				DetailsInXl detailsInXlObj = new DetailsInXl();

				// Saving the row value to access the cell value
				
				row = sheet.getRow(i);

				if (row.getCell(Integer.parseInt(prop.getProperty("business_partner_id"))) != null) {

					detailsInXlObj.setBusiness_partner_id(row.getCell(Integer.parseInt(prop.getProperty("business_partner_id"))).toString());
				}

				if (row.getCell(Integer.parseInt(prop.getProperty("business_partner_name"))) != null) {

					detailsInXlObj.setBusiness_partner_name(row.getCell(Integer.parseInt(prop.getProperty("business_partner_name"))).toString());
				}

				if (row.getCell(Integer.parseInt(prop.getProperty("business_partner_code "))) != null) {

					detailsInXlObj.setBusiness_partner_code(row.getCell(Integer.parseInt(prop.getProperty("business_partner_code"))).toString());
				}

				if (row.getCell(Integer.parseInt(prop.getProperty("contact_name"))) != null) {

					detailsInXlObj.setContact_name(row.getCell(Integer.parseInt(prop.getProperty("contact_name"))).toString());
				}

				if (row.getCell(Integer.parseInt(prop.getProperty("address1"))) != null) {

					detailsInXlObj.setAddress1(Integer.parseInt(row.getCell(Integer.parseInt(prop.getProperty("address1"))).toString()));
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("address2"))) != null) {

					detailsInXlObj.setAddress2(Integer.parseInt(row.getCell(Integer.parseInt(prop.getProperty("address2"))).toString()));
				}
				

				if (row.getCell(Integer.parseInt(prop.getProperty("city"))) != null) {

					detailsInXlObj.setCity(row.getCell(Integer.parseInt(prop.getProperty("city"))).toString());
			
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("province"))) != null) {

					detailsInXlObj.setProvince(row.getCell(Integer.parseInt(prop.getProperty("province"))).toString());
			
				}

				if (row.getCell(Integer.parseInt(prop.getProperty("country"))) != null) {

					detailsInXlObj.setCountry(row.getCell(Integer.parseInt(prop.getProperty("country"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("postal_code"))) != null) {

					detailsInXlObj.setPostal_code(row.getCell(Integer.parseInt(prop.getProperty("postal_code"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("parent_company"))) != null) {

					detailsInXlObj.setParent_company(row.getCell(Integer.parseInt(prop.getProperty("parent_company"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("toll_free_number"))) != null) {

					detailsInXlObj.setToll_free_number(row.getCell(Integer.parseInt(prop.getProperty("toll_free_number"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("phone"))) != null) {

					detailsInXlObj.setPhone(row.getCell(Integer.parseInt(prop.getProperty("phone"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("phone_extension"))) != null) {

					detailsInXlObj.setPhone_extension(row.getCell(Integer.parseInt(prop.getProperty("phone_extension"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("fax"))) != null) {

					detailsInXlObj.setFax(row.getCell(Integer.parseInt(prop.getProperty("fax"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("website_url"))) != null) {

					detailsInXlObj.setWebsite_url(row.getCell(Integer.parseInt(prop.getProperty("website_url"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("patment_condition"))) != null) {

					detailsInXlObj.setPayment_condition(row.getCell(Integer.parseInt(prop.getProperty("patment_condition"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("gl_number"))) != null) {

					detailsInXlObj.setGl_number(row.getCell(Integer.parseInt(prop.getProperty("gl_number"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("driver_min_age"))) != null) {

					detailsInXlObj.setDriver_min_age(row.getCell(Integer.parseInt(prop.getProperty("driver_min_age"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("api_enabled"))) != null) {

					detailsInXlObj.setApi_enabled(row.getCell(Integer.parseInt(prop.getProperty("api_enabled"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("status"))) != null) {

					detailsInXlObj.setStatus(row.getCell(Integer.parseInt(prop.getProperty("status"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("one_way_free_paid_by"))) != null) {

					detailsInXlObj.setOne_way_free_paid_by(row.getCell(Integer.parseInt(prop.getProperty("one_way_free_paid_by"))).toString());
				}
				
				if (row.getCell(Integer.parseInt(prop.getProperty("country_code"))) != null) {

					detailsInXlObj.setCountry_code(row.getCell(Integer.parseInt(prop.getProperty("country_code"))).toString());
				}
				
				
				detailsObjList.add(detailsInXlObj);

			}

			workbook.close();

		} catch ( IOException | NumberFormatException | ParseException e) {

			System.out.println("Exception occured while reading the data from the Excel sheet ");
			e.printStackTrace();
		}

		return detailsObjList;		
		
	}
	
}
