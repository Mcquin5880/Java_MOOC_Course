package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.springframework.stereotype.Component;


@Component
public class FortuneServiceFromFile implements FortuneService {
	
	private String fileName = "/spring-demo-annotations/src/fortune-data.txt";
	private List<String> fortunes;
	private Random random = new Random();
	
	public FortuneServiceFromFile() {
		
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		this.fortunes = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
			
			String line;
			
			while ((line = br.readLine()) != null) {
				this.fortunes.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.size());
		String tempFortune = fortunes.get(index);
		return tempFortune;
	}

}
