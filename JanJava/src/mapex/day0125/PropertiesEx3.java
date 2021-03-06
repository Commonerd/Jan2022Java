package mapex.day0125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		//properties파일의 내용을 저장할 수 있는 공간
		
		String path = "data.properties";
		//파일의 경로를 지정한 다음 읽어온다. 
		
		p.load(new FileInputStream(path));
		//공간을 만들어 로드. 키 밸류로 짝지어 저장한다. 
		
		String name = p.getProperty("name");
		String[] data = p.getProperty("data").split(",");
		
		int sum = 0;
		
		for(int i = 0; i < data.length ; i++) {
			int d = Integer.parseInt(data[i]);
			sum += d;
		}
		
		System.out.println("이름 : "+ name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum / (double)data.length);
	}

}






