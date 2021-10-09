package Decorator.JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            // 设置InputStream 先用BufferedInputStream装饰 再用LowerCaseInputStream装饰
            InputStream in = new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("F:\\IDEAfile\\DesignPatterns\\src\\Decorator\\JavaIO\\test.txt")));
            // 用流来读取 乙知道微端
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
