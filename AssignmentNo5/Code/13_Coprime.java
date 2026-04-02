class CoprimeNum {
    public static void main(String[] args) {
        int a=8;
        int b=15;
        int x=a;
        int y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            y=temp;
        }
        if(x==1){
        System.out.println("Coprime Number");
        }else{
            System.out.println("NOt Coprime Number");
        }
    }
}
