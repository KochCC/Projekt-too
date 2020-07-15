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

System.out.println("YOU HAVE OPENED UP THE BRIDGE...I mean...PROGRAM OF DEATH! \n");
System.out.println("What is your name?");
String userName = inputword.nextLine();
//Do not need to change

System.out.println("\nWhat is your quest?");
String thisisthequest = inputword.nextLine();
//Do not need to change

System.out.println("\nWhat is the capital of Assyria? (You don't need to use the funny symbols)");
String oneofafewcities = inputword.nextLine();
/*https://en.wikipedia.org/wiki/Assyria
Any of these: Assur (aktushually Aššur), Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, Harran
*/

System.out.println("\nWhat is the airspeed of the unlaiden European swallow in whole kilometers per hour?");
Double europeanswallows = inputword.nextDouble();
/*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
28 mph is roughly 12.5 m/s...45 kph*/

System.out.println("\nWhat is the airspeed of the unladen African swallow in whole kilometers per hour?");
Double africanswallows = inputword.nextDouble(); 
/*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
21 mph...33.8 kph*/





/*  *******************CHANGE BELOW*********************
System.out.println("\n\n\n\n\n\nSir " + userName + ", trying to " + thisisthequest + ",");
System.out.println("Who does not realize " + oneofafewcities + " is the wrong way to spell the capitol of Assyria,");
System.out.println("who assumes " + europeanswallows + "is the airspeed of the unlaiden European swallow,");
System.out.println("and that the unladen airspeed of the African swallow is" + africanswallows + ",");
System.out.println("has the program's fullest permission to do the thing!");*/

}
}