package sample.regularexpression;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 * 正規表現によるマッチングを行う
 */
public class App {
    public static void main( String[] args ) throws IOException {
        System.out.println("text\tpattern\tresult");
        for(String text : Files.readAllLines(Paths.get(args[0]))){
            for(String pattern : Files.readAllLines(Paths.get(args[1]))){
                System.out.println(String.format("%s\t%s\t%b", text, pattern, text.matches(pattern)));
            }
        }
    }
}
