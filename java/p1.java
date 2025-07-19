public class p1{
public static void main(String[] args){
int n=10;
int count=0;
int num=2;

System.out.println("first"+n+"prime numbers are:");
while(count<n){
if(isprime(num)){
System.out.println(num+" ");
count++;
}
num++;
}
}
public static boolean isprime(int num){
if(num<2)
return false;
for(int i=2; i<=num /2; i++){
if (num % i==0)
return false;
}
return true;
}
}
