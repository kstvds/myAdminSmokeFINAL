package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	Properties pro;
	public Configuration()
	{
		try {
			File src=new File("./Configuration/Config.property");
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception===="+e.getMessage());
		}
	}
	public String getChromePath()
	{
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	public String getIEPath()
	{
		String IEpath=pro.getProperty("IEDriver");
		return IEpath;
	}
	public String getApplicationUrl(){	
		String url=pro.getProperty("URL");
	    return url;
	}
	public String getApplicationUrl1(){	
		String url=pro.getProperty("URL");
	    return url;
	}
	public String getExcelPath(){
		return pro.getProperty("ExcelPath");
		
	}
	public String getExcelPathRate(){
		return pro.getProperty("ExcelPathRate");
		
	}
	public String LogFile(){
		String logpath=pro.getProperty("Log");
		return logpath;
		
	}
	public String SnapShotPath(){
		String snap=pro.getProperty("ScreenShot");
		return snap;
		
	}
	public String GenerateReport(){
		String report=pro.getProperty("ReportPath");
		return report;
		
	}
	public String getExcelPathTourVisa(){
		return pro.getProperty("ExcelPathTourVisa");
		
	}
}
