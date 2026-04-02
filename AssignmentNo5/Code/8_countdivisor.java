class CountDivisor{
    public static void main(String[]args){
        int n=12;
        int num=1;
        int count=0;
        while(num<=n){
            if(n%num==0){
                count++;
            }
            num++;
        }
        System.out.print(count);
    }
}