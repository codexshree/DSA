class CheckPrimeNum {
    public static void main(String[] args) {
        int n=20;
        int count=0;
        int num=1;
        while(num<=n){
            if(n%num==0){
                count++;
            }
            num++;
          
        }
        if(count==2){
            System.out.print("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
