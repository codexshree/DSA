class PalindromeNum {
    public static void main(String[] args) {
        int n=1234;
        int original=n;
        int rem=0;
        int rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.print("Not a palindrome Number");
        }
    }
}
