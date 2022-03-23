import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImpl {
    Queue<String> reception=new LinkedList<>();
    Queue<String> waitingRoom=new LinkedList<>();
    String inRoom=null;
    boolean isIn=false;
    void display()
    {
        System.out.println("In Interview Room -->  "+inRoom);
        System.out.println("Waiting Room  -->  "+waitingRoom);
        System.out.println("Reception  -->  "+reception);
    }

    void callNextCandidate()
    {
        if(!isIn && !waitingRoom.isEmpty())
        {
            isIn=!isIn;
            inRoom=waitingRoom.remove();
            if(!reception.isEmpty())
                waitingRoom.add(reception.remove());
            System.out.println(inRoom+" enters interview room");
        }
        else System.out.println("Candidate in Room");
    }

    boolean outCandidate()
    {
        if(isIn)
        {
            System.out.println(inRoom+" leaves interview room");
            inRoom=null;
            isIn=!isIn;
            return true;
        }
        else
        {
            System.out.println("No one in interview room");
            return false;
        }
    }
    public static void main(String[] args)
    {
        QueueImpl queue=new QueueImpl();
        Scanner sc=new Scanner(System.in);
        int candidates,candidatesWaiting,option,ctr=0;

        System.out.println("Enter the number of candidates : ");
        candidates=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names of candidates:");
        for (int i=0;i<candidates;i++)
        {
            queue.reception.add(sc.nextLine());
        }

        System.out.println("Enter no. of candidates in waiting room : ");
        candidatesWaiting=sc.nextInt();
        for (int i=0;i<candidatesWaiting;i++)
        {
            queue.waitingRoom.add(queue.reception.remove());
        }

        do {
            System.out.println("Enter your choice");
            option=sc.nextInt();

            switch (option)
            {
                case 1:
                    queue.display();
                    break;

                case 2://nextcandidate
                    queue.callNextCandidate();
                    break;

                case 3://send interviewee out
                    if(queue.outCandidate())
                        ctr++;
                    break;
            }

        }while (ctr<candidates);
        System.out.println("Interview Ends!!");
    }
}
