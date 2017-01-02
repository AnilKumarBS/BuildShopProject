package libraries;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.websocket.api.Session;
import org.openqa.selenium.io.Zip;

public class BackUp {
	static SimpleDateFormat sdfDate;
	static String path = System.getProperty("user.dir").replace("\\", "\\");
	public static void main(String[] args) throws IOException {
		int b;
		File curr_out = null;
		try
		{
			File file_in = new File(path+"\\target\\surefire-reports\\testng-results.xml");
			File file_out = new File(path+"\\Result_Archive\\results.txt");
			new File(path+"\\Reports\\results_archive\\current").mkdir();
			curr_out = new File(path+"\\Reports\\results_archive\\current\\results.txt");
			FileInputStream fis = new FileInputStream(file_in);
			FileOutputStream fos = new FileOutputStream(file_out);
			FileOutputStream fos1 = new FileOutputStream(curr_out);
			try {
				while ( (b= fis.read()) != -1 )
					try {
						fos.write(b);
						fos1.write(b);
					} catch (IOException e) {
						System.err.println("-----------------------------------------------------------");
						System.err.println("Unable to write in to results.txt in Result_Archive folder");
						e.printStackTrace();
						System.err.println("-----------------------------------------------------------");
					}
			} catch (IOException e) {
				System.err.println("-----------------------------------------------------------");
				System.err.println("Error in reading target\\surefire-reports\\testng-results.xml file or  Result_Archive\\results.txt");
				e.printStackTrace();
				System.err.println("-----------------------------------------------------------");
			}
			
		} 
		
		catch (FileNotFoundException e) {
			
			System.err.println("-----------------------------------------------------------");
			System.err.println("Error in locating target\\surefire-reports\\testng-results.xml file or  Result_Archive\\results.txt");
			e.printStackTrace();
			System.err.println("-----------------------------------------------------------");
		}
		sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String strDate =sdfDate.format(now).replace(":", "_");
		new File(path+"\\Reports\\results_archive\\"+strDate).mkdir();
		File file_to_compress = new File(path+"\\target\\surefire-reports");
		File compress_file_to = new File(path+"\\Result_Archive\\"+strDate+path+"zip");
		Zip z = new Zip();
		try
		{
			Thread.sleep(10000);
			z.zip(file_to_compress, compress_file_to);
			File result_file = new File(path+"\\target\\surefire-reports\\testng-results.xml");
			FileUtils.copyFile(result_file, new File(path+"\\Result_Archive\\Build_Results\\"+strDate+path+"txt"));	
		}
		catch(Exception e)
		{
			System.err.println("-----------------------------------------------------------");
			System.err.println("Unable to zip target\\surefire-reports folder");
			e.printStackTrace();
			System.err.println("-----------------------------------------------------------");
		}
		
		File file_to_delete1 = new File(path+"\\Reports\\results_archive\\foldernames.txt");
		File file_to_delete2 = new File(path+"\\Reports\\results_archive\\file.csv");
		try
		{
			FileUtils.forceDelete(file_to_delete1);
			FileUtils.forceDelete(file_to_delete2);
		}
		catch(Exception e)
		{
			System.err.println("-----------------------------------------------------------");
			System.err.println("Unable to delete file foldernames.txt or file.csv");
			e.printStackTrace();
			System.err.println("-----------------------------------------------------------");
		}
		File[] file1 = sortFolderName();

		for (int i=0;i<file1.length;i++) {
			writeToCsv1(file1[i].getName(), true);		        
		}
		
		File read_file = new File(path+"\\Reports\\results_archive\\file.csv");
		FileUtils.copyFile(read_file, new File(path+"\\Reports\\results_archive\\foldernames.txt"));
		FileUtils.copyDirectory(new File(path+"\\screenshots"), new File(path+"\\Reports\\results_archive\\current\\screenshots"));
		FileUtils.copyDirectory(new File(path+"\\screenshots"), new File(path+"\\Reports\\results_archive\\"+strDate+"\\screenshots"));
		FileUtils.copyFile(curr_out, new File(path+"\\Reports\\results_archive\\"+strDate+"\\results.txt"));
		FileUtils.copyFile(new File(path+"\\basicinfo.txt"), new File(path+"\\Reports\\results_archive\\current\\basicinfo.txt"));
		FileUtils.copyFile(new File(path+"\\basicinfo.txt"), new File(path+"\\Reports\\results_archive\\"+strDate+"\\basicinfo.txt"));
//		if(ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "config", 1, 2).equals("Yes"))
//		{
//			BackUp.createEmailReport();
//			sendEmail();
//		}
//		if(ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "config", 1, 2).equals("No"))
//		{
//			
//		}
	}

	static void createEmailReport()
	{
		 try {
			 		File file_to_delete = new File(path+"\\email_report\\report_zip");
			 		try
					{
						FileUtils.deleteDirectory(file_to_delete);
					}
					catch(Exception e)
					{	
						System.err.println("-----------------------------------------------------------");
						System.err.println("Unable to delete folder email_report\\report_zip ");
						e.printStackTrace();
						System.err.println("-----------------------------------------------------------");
					}
			 		FileUtils.copyDirectory(new File(path+"\\Reports\\css"), new File(path+"\\email_report\\Reports\\css"));
			 		FileUtils.copyDirectory(new File(path+"\\Reports\\html_reports"), new File(path+"\\email_report\\Reports\\html_reports"));
			 		FileUtils.copyDirectory(new File(path+"\\Reports\\js"), new File(path+"\\email_report\\Reports\\js"));
			 		FileUtils.copyDirectory(new File(path+"\\Reports\\results_archive\\current"), new File(path+"\\email_report\\Reports\\results_archive\\current"));
			 		FileUtils.copyFile(new File(path+"\\Reports\\results_archive\\foldernames.txt"), new File(path+"\\email_report\\Reports\\results_archive\\foldernames.txt"));
			 		FileUtils.copyFile(new File(path+"\\Reports\\index.html"), new File(path+"\\email_report\\Reports\\index.html"));
			 		File file_to_compress = new File(path+"\\email_report\\Reports");
			 		new File(path+"\\email_report\\report_zip").mkdir();
			 		File compress_file_to = new File(path+"\\email_report\\report_zip\\report"+path+"zip");
					Zip z = new Zip();
					try
					{
						Thread.sleep(100);
						z.zip(file_to_compress, compress_file_to);
						
					}
					catch(Exception e)
					{

						System.err.println("-----------------------------------------------------------");
						System.err.println("Unable to zip the results ");
						e.printStackTrace();
						System.err.println("-----------------------------------------------------------");
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void sendEmail()
	{
			String host = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 0);
	        String port = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 1);
	        String mailFrom = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 2);
	        String password = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 3);
	        // message info
	        String mailTo = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 4);
	        String subject = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 5);
	        String message = ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Email_settings", 1, 6);
	        // attachments
	        String[] attachFiles = new String[1];
	        attachFiles[0] = path+"\\email_report\\report_zip\\report.zip";
	 
	        try {
	            sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
	                subject, message, attachFiles);
	     
	        } catch (Exception ex) {
	        	System.err.println("-----------------------------------------------------------------------------------------------------------------------------");
				System.err.println("Please Check The Configuration Excel file under config folder and make sure to fill all the fields in Email_Settings sheet");
				System.err.println("-----------------------------------------------------------------------------------------------------------------------------");
				System.exit(0);
	        }
	}
	
	
	static public void writeToCsv1(String val, boolean finalVal){
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(new File(path+"\\Reports\\results_archive\\file.csv"),true));
			b.write(val+",");
			if(finalVal){
				b.write("");
			}
			b.close();		
		} catch (IOException e) {

			System.out.println(e);
		}
	}
	public static void sendEmailWithAttachments(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message, String[] attachFiles) throws AddressException, MessagingException
           {
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
 
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");
 
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
 
        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();
 
                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
 
                multipart.addBodyPart(attachPart);
            }
        }
 
        // sets the multi-part as e-mail's content
        msg.setContent(multipart);
 
        // sends the e-mail
        Transport.send(msg);
 
    }
	private static File[] sortFolderName()
	{
		
		File dir = new File(path+"\\Reports\\results_archive");
	    File[] files = dir.listFiles();
	    FileFilter fileFilter = new FileFilter() {
	       public boolean accept(File file) {
	          return file.isDirectory();
	       }
	    };
	    files = dir.listFiles(fileFilter);
	    
	    if (files.length == 0) {
	       System.out.println("Either dir does not exist or is not a directory");
	    }
	    else {
	       for (int i=0; i< files.length; i++) {
	          File filename = files[i];
//	          System.out.println(filename.toString());
	       }
	    }
	    
	    Arrays.sort( files, new Comparator()
	    {
	        public int compare(Object o1, Object o2) {

	            if (((File)o1).lastModified() > ((File)o2).lastModified()) {
	                return -1;
	            } else if (((File)o1).lastModified() < ((File)o2).lastModified()) {
	                return +1;	                
	            } else {
	                return 0;
	            }
	        }

	    });
		return files;
	}
	

}
