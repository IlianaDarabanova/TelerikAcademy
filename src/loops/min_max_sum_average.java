package loops;


import java.util.Scanner;

public class min_max_sum_average {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float N = reader.nextFloat();
		float sum =0;
		float min=10001;
		float max = -10001;
		float average = 0;
		float currentNum;
		for(int i =0;i<N;i++){
			currentNum = reader.nextFloat();
			sum +=currentNum;
			if(currentNum>max){
				max=currentNum;
			}
			if(currentNum<min){
				min = currentNum;
			}
			
			
			
		}
		average=sum/N;
		System.out.printf("min=%.2f\n",min);
		System.out.printf("max=%.2f\n",max);
		System.out.printf("sum=%.2f\n",sum);
		System.out.printf("avg=%.2f",average);
			}

}
