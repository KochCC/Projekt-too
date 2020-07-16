/*Feel free to utilize your previous code as a starting point!

Project Specifications:

must utilize at least 1 array variable
must accept user input
must utilize a loop
must utilize a conditional
must run as an import in repl.it!
similar to Project 1, this should be a practical tool of your choosing
To turn in your project, please input the URL for your Github project for this. Each project should have a unique Github repo, and each should be importable into Repl.it without change for me to evaluate!

e.g. If I was turning this in, mine would be: https://github.com/TheElliot/LiberateToAutomate (Links to an external site.)

P.S. The most important thing you can do is to turn projects in. I can't legitimately give a grade above 0 without a project turned in, so please help me to help you get your well-deserved A! */

//"Inspired" by Monty Python's Search for the Holy Grail movie, Bridge of Death scene
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner inputword = new Scanner(System.in);
boolean userflung = false;

/*   Array below!!!!!!!!!!!!!
Object[] answer = new Object[5];

answer[0] = new String();
answer[1] = new String();
answer[2] = new String();
answer[3] = new Integer();
answer[4] = new Integer();
*/
while (userflung == false) {
System.out.println("YOU HAVE OPENED UP THE BRIDGE...I mean...PROGRAM OF DEATH!");
System.out.println("What is your name?");
String userName = inputword.nextLine();
//Do not need to change

System.out.println("\nWhat is your quest?");
String thisisthequest = inputword.nextLine();
//Do not need to change

System.out.println("\nWhat is the capital of Assyria? (You don't need to use the funny symbols over vowels.)");
String oneofafewcities = inputword.nextLine();
if (!"Assur".equals(oneofafewcities) && !"Shubat-Enlil".equals(oneofafewcities) && !"Kalhu".equals(oneofafewcities) && !"Dur-Sharrukin".equals(oneofafewcities) && !"Nineveh".equals(oneofafewcities) && !"Harran".equals(oneofafewcities)) {
userflung = true;
break;
}
/*https://en.wikipedia.org/wiki/Assyria
Any of these: Assur (aktushually Aššur), Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, Harran
*/

System.out.println("\nWhat is the airspeed of the unlaiden European swallow in whole kilometers per hour?");
int europeanswallows = inputword.nextInt();
if ( europeanswallows != 45) {
userflung = true;
break;
}
/*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
28 mph is roughly 12.5 m/s...45 kph*/


System.out.println("\nWhat is the airspeed of the unladen African swallow in whole kilometers per hour?");
int africanswallows = inputword.nextInt();
if ( africanswallows != 34 ) {
userflung = true;
break;
}
/*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
21 mph...33.8 kph*/


if (userflung != true){
System.out.println("Oh, you may go, enjoy your day.");
}
} //end of while loop
if (userflung == true){
System.out.println("[Laughs in evil] You are no king, YOU FAIL! GOOD DAY SIR OR MADAM!");
}

}
}