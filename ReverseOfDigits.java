public class ReverseOfDigits{
    public static void main(String[] args){
        int x=7584;
        int reverse=0;
        while(x>0){
            reverse=reverse*10 + x%10;
            x=x/10;
        }
        System.out.println("Reverse of digits:" + reverse);
    }
}