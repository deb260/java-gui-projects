import java.util.Random;
class NumberGen implements Runnable{
public void run(){
Random rand=new Random();

for(int i=1;i<=5;i++){
int num=rand.nextInt(100);
System.out.println("Generated number:"+ num);

if (num%2==0)
new Thread(new Square(num)).start();
else
new Thread(new Cube(num)).start();

try{
Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

class Square implements Runnable{
int n;
Square(int n){
this.n=n;
}
public void run(){
System.out.println("Square:"+ (n*n));
}
}


class Cube implements Runnable{
int n;
Cube(int n){
this.n=n;
}
public void run(){
System.out.println("Cube:"+ (n*n*n));
}
}

public class NumberGenerator{
public static void main(String[] args){
new Thread(new NumberGen()).start();
}
}