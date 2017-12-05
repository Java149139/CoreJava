package input_output_7;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class File_in_out {
	public static void main(String[] args) throws IOException{
		PrintWriter out = new PrintWriter("D:\\JavaFile.txt","utf-8");
		out.printf("Ð´ÈëÎÄ¼þ");
		
		Scanner in = new Scanner(Paths.get("D:\\JavaFile.txt"),"utf-8");
		out.close();
		in.close();
	}
}
