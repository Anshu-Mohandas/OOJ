import java.util.Scanner;
class Bms extends Thread {
synchronized public void run() {
try {
int i=0;
while (i<5) {
sleep(10000);
System.out.println("BMS College of Engineering ");
i++;
}
} catch (Exception e) {
}
}
}

class Cse extends Thread {
synchronized public void run() {
try {
int i=0;
while (i<5) {
sleep(2000);
System.out.println("CSE");
i++;
}
} catch (Exception e) {
}
}
}


class Main{
public static void main(String args[]) {
Bms t1 = new Bms();
Cse t2 = new Cse();
t1.start();
t2.start();

}
}