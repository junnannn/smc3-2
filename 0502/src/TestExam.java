import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		int sum = 0;
		System.out.println("500이하의 자연수를 입력하세요");
		
			i = sc.nextInt();
		
		for(int z = 1;z<=i;z++) {
			if(z%3==0) {
				if(z%2!=0) {
					System.out.println(z);
					sum += z;
				}
				
			
			}
			
		}
		System.out.println("1~"+i+"까지 3의 배수이면서 홀수인 수의 합은 "+sum+"입니다.");
	}

}
