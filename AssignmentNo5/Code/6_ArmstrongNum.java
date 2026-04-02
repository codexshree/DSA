class ArmstrongNum {
    public static void main(String[]args){
        int num=153;
        int original=num;
        int sum=0;
        int cube=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;
        }
        if(original==sum){
            System.out.print("Armstrong Number  ");
        }else{
            System.out.print("Not a Armstrong NUmber");
        }

    }    
}
