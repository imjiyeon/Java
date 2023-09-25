package quiz;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter을 사용하여 quiz3.txt 텍스트파일에 숫자 1부터 10 중에서 짝수를 출력하세요. 
 * */
public class Quiz3 {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("quiz3.txt");
		
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				fw.write(i+" ");
			}
		}
		
		fw.flush();
		
	}
}
