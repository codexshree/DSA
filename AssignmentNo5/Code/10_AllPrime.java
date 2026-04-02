class AllPrime {
    public static void main(String[] args) {
        int n=20;
        int i=2;
        while(i<=n){
            int j=2;
            boolean isPrime=true;
            while(j<i){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                j++;
            }
            if(isPrime){
                System.out.println(i);
            }
            i++;
        }
    }
}
