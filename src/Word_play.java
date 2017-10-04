import java.util.Scanner;

public class Word_play{
    public static void main(String[]args){

        int date,time;
        String place,whp,whowasthere,whdiddo,whpnxt,whego,tellingstry,cons;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Please enter the date");
        date=keyboard.nextInt();
        System.out.print("Please enter time");
        time=keyboard.nextInt();
        System.out.print("Please enter a place");
        place=keyboard.next();
        System.out.print("Please tell what needs to be happen?");
        whp=keyboard.next();
        System.out.print("Please tell who was there?");
        whowasthere=keyboard.next();
        System.out.print("Please tell what did they do?");
        whdiddo=keyboard.next();
        System.out.print("Please tell what happened next?");
        whpnxt=keyboard.next();
        System.out.print("Please where do they went?");
        whego=keyboard.next();
        System.out.print("Please tell to whom you tell for?");
        tellingstry=keyboard.next();
        System.out.print("Please tell what was the consequence?");
        cons=keyboard.next();

        System.out.print("The date was "+date+" , and it was "+time+" p.m. When we go to "+place+", we got something\n"+
                "strange "+whp+" . I was with my "+whowasthere+". When we were crossing the place, we saw two gentlemen running for the store "+whdiddo+ "stuff. We follow them to see\n" +
                "where they are going and finally we saw them "+whpnxt+" what where they doing "+whego+" the stuff to the third\n" +
                "party "+tellingstry+". After that, we go to tell what we saw to the police.\n" +
                "Based on the information, the police start an "+cons+" on the suspects.");

    }
}
