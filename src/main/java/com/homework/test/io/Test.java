package com.homework.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) {
        Test ts = new Test();
//		ts.fileSave();
        ts.fileRead();
    }

    // QUESTION 02
    private void fileRead() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;

        try {
            System.out.println("읽을 파일명 입력 : ");
            fileName = br.readLine();
            br = new BufferedReader(new FileReader(fileName));

            int contents = 0;
            StringBuilder sb = new StringBuilder();

            while((contents = br.read()) != -1) {
                sb.append((char)contents);
            }
            System.out.println(sb);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }


    }

    // QUESTION 01
    private void fileSave() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fw = null;

        String fileName = null;
        String data = null;

        try {
            System.out.println("파일명 입력 : ");
            fileName = br.readLine();

            fw = new FileWriter(fileName);
            System.out.println("파일에 저장할 내용을 입력하시오.");
            while((data = br.readLine()) != null) {
                if("exit".equals(data)) break;
                fw.write(data);
                fw.write("\n");
            }
            System.out.println("파일이 성공적으로 저장되었습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
