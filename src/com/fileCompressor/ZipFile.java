package com.fileCompressor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

	public static void main(String[] args) {
		String filePath = "D:\\java-workspace\\codingPractice\\src\\com\\fileCompressor\\testFile";
		ZipFile zipFile = new ZipFile();
		zipFile.convert(filePath);
	}
	
	private void convert(String filePath) {
		
		
		try {
			File file = new File(filePath);
			String zipFileName = file.getName() + ".zip";
			System.out.println(zipFileName);
			FileOutputStream fileOutputStream = new FileOutputStream(zipFileName);
			ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
			
			
			zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
			
			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
			zipOutputStream.write(bytes, 0, bytes.length);
			zipOutputStream.closeEntry();
			zipOutputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
