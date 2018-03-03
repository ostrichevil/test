package demo.fileio;

import java.io.*;

/**
 * @author  lz
 * @date
 * */
public class ReadTest {

    public static void main(String[] args) {
        String filePath ="/Users/lizheng/Desktop/bdiMock.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line =null;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e)
        {}
        finally {
        }
//        for(int i=0;i<10;i++) {
//            if (i == 0) {
//                continue;
//            }
//            System.out.println("aaaa");
//        }
    }
}
