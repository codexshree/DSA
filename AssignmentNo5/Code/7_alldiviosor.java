class AllDivisor{
    public static void main(String[]args){
        int n=12;
        int num=1;
        while(num<=n){
            if(n%num==0){
                System.out.print(num+ " ");
                
            }
            num++;
        }
    }
}