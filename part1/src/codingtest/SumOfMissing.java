package codingtest;

public class SumOfMissing {

	public static void main(String[] args) {
		int[] data1 = {1,2,3,4,6,7,8,0};	//5,9
		int[] data2 = {5,8,4,0,6,7,9};		//1,2,3
		
		System.out.println(solution(data1));
		System.out.println(solution(data2));
		
	}

	public static int solution(int[] numbers) {		//정지호
        int answer = -1;
        int sum=0;
        for(int i=0;i<numbers.length;i++) {
        		sum+=numbers[i];
        }
        answer=45-sum;
        return answer;
    }
	
	public static int solution0(int[] numbers) {  //중첩된 for사용 - 이 문제에서는 좋은 방법 아님.
        int answer = 0;
        
        for(int i=1;i<10;i++){
            int j;
            for( j=0;j<numbers.length;j++){
                if(i==numbers[j]) {
                    break;
                }
            }
            if(j==numbers.length) answer+=i;
        }
        return answer;
    }
	
}
