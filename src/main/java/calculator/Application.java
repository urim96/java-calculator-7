package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

    	try {
    		System.out.println("덧셈할 문자열을 입력해 주세요.");
    		String str = Console.readLine();
    		int checkNum = Application.checkStr(str);
    		System.out.println("결과 : " + checkNum);
    	}catch(Exception e) {
    		throw new IllegalArgumentException();
    	}
    }
    
    public static int checkStr(String str) {
    	if(str.length() == 0 || str == null) {
    		return 0;
    	}
    	if(str.length() == 1) {
    		return Integer.parseInt(str);
    	}
		return 0;
    }
}
