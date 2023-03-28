package com.edu.exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading {
    // 발생한 예외를 즉각적으로 잡지않고 던짐.. 호출한 지점으로 예외가 날아감
    public void readFile(String fileName) throws FileNotFoundException, IOException {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName); // CompileException
            System.out.println("1. 파일을 잘 찾았습니다.");
        } finally {
            reader.close();
        }
        System.out.println("1. FileReader API Creating");
    }
}

public class CompileExceptionTest2 {

public static void main(String[] args) throws Exception {
    FileReading fr = new FileReading();
    fr.readFile("C:\\KB\\workshop_homework\\java_r1_Workshop.pdf");

    System.out.println("3. 파일을 잘 읽었음");
}
}