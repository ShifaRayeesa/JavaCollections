import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue
{
    Queue<String> reception=new LinkedList<>();
    Queue<String> waitingRoom=new LinkedList<>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MyQueue queue=new MyQueue();
        System.out.println("Enter the no.of candidates");
        int noCandidates=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names of candidates");
        for(int i=0;i<noCandidates;i++)
        {
            queue.reception.add(sc.nextLine());
        }

        System.out.println("\nEnter maximum members in Waiting Room");
        int noWaiting=sc.nextInt();
        sc.nextLine();
        System.out.println("\nBefore Interview\n");
        System.out.println("Waiting Room");
        System.out.println(queue.waitingRoom.size()+"  -->  "+queue.waitingRoom);
        System.out.println("Reception");
        System.out.println(queue.reception.size()+"  -->  "+ queue.reception);

        System.out.println("\nInterview starts..");
        String temp,tempInterviwee=queue.reception.remove();
        System.out.println("\nIn Interview Room  -->  "+tempInterviwee);
        for(int i=0;i<noWaiting;i++)
        {
            temp=queue.reception.remove();
            queue.waitingRoom.add(temp);
        }
        System.out.println("Waiting Room");
        System.out.println(queue.waitingRoom.size()+"  -->  "+queue.waitingRoom);
        System.out.println("Reception");
        System.out.println(queue.reception.size()+"  -->  "+ queue.reception);
        while (!queue.reception.isEmpty())
        {
            temp=queue.reception.remove();
            queue.waitingRoom.add(temp);
            tempInterviwee=queue.waitingRoom.remove();
            System.out.println("\nIn Interview Room  -->  "+tempInterviwee);
            System.out.println("Waiting Room");
            System.out.println(queue.waitingRoom.size()+"  -->  "+queue.waitingRoom);
            System.out.println("Reception");
            System.out.println(queue.reception.size()+"  -->  "+ queue.reception);
        }

        System.out.println("\nThe reception is empty!\n");
        while (!queue.waitingRoom.isEmpty())
        {
            tempInterviwee=queue.waitingRoom.remove();
            System.out.println("\nIn Interview Room  -->  "+tempInterviwee);
            System.out.println("Waiting Room");
            System.out.println(queue.waitingRoom.size()+"  -->  "+queue.waitingRoom);
            System.out.println("Reception");
            System.out.println(queue.reception.size()+"  -->  "+ queue.reception);
        }
        System.out.println("\nInterview ends!!");
    }
}
