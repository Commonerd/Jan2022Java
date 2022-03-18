package dateex.day0125;

import java.util.*;
import java.text.*;

class DateFormatEx4Practice {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate= null;
		
		System.out.println("날짜를 "+pattern + "의 형태로 입력해주세요.(입력예:2021/05/11");
		
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("날짜를 "+pattern+"의 형태로 다시 입력해주세요.(입력예:2021/05/11)");
			}
		}//while
		
		Calendar cal = Calendar.getInstance();//객체만들기
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		
		System.out.println("입력하신 날짜는 현재와 "+Math.abs(day)+"시간 차이가 있습니다.");
		s.close();
	}//main
}







