package com.techlabs.acceptfilename;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AcceptFileName {

	public static void main(String[] args) {
		

		
		        String fileName = "C:\\Users\\vismi\\OneDrive\\Documents\\Monocept\\FILEINPUT.txt"; 
		        int lineCount = 0;
		        int charCount = 0;
		        int wordCount = 0;
		        
		        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                lineCount++;
		                charCount += line.length();
		                String[] words = line.split("\\s+");
		                wordCount += words.length;
		            }
		        } catch (IOException e) {
		            System.out.println("Error reading the file: " + e.getMessage());
		            return;
		        }
		        
		        System.out.println("Number of lines: " + lineCount);
		        System.out.println("Number of characters: " + charCount);
		        System.out.println("Number of words: " + wordCount);
		    }
		


	}


