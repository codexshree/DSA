import java.util.Scanner;

class ChessboardPattern{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range of n : ");
		int n=sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if((i+j)%2==0){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}