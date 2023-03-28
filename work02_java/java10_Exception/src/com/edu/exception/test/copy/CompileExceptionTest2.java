package com.edu.exception.test.copy;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.annotation.processing.AbstractProcessor;

class FileReading{
	public void readFile(String fileName) {
		try {
			FileReader reader = new FileReader(fileName);	
		System.out.println();
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		System.out.println("1. FileReader API Creating");			
	}
}

public class CompileExceptionTest2 {

	public static void main(String[] args) {
		FileReading fr = new FileReading();
		fr.readFile("C:\\workshop\\java_r1_Workshop");
		System.out.println("3. 파일을 잘 읽어들였습니다.");
	}

}
