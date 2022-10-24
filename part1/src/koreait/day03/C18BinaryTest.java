package koreait.day03;

public class C18BinaryTest {		
   public static void main(String[] args) {
	System.out.println("1.10진수를 2진수로 변환");
	System.out.println(Integer.toBinaryString(-1));  
	System.out.println(Integer.toBinaryString(-2147483648));  //int 음수 절대값 최대
	System.out.println(Integer.toBinaryString(2147483647));    //    양수 최대값
	System.out.println(Integer.toBinaryString(11));  
	System.out.println(Integer.toBinaryString(1024));
	System.out.println("2.10진수를 16진수로 변환");
	System.out.printf("0x%08x\n",-1);
	System.out.printf("0x%08x\n",-2147483648);
	System.out.printf("0x%08x\n",2147483647);
	System.out.printf("0x%08x\n",11);
	System.out.printf("0x%08x\n",1024);   //1024바이트 = 1KB
}
}
