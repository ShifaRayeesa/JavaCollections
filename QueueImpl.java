import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImpl {
    Queue<String> reception=new LinkedList<>();
    Queue<String> waitingRoom=new LinkedList<>();



    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        QueueImpl queue=new QueueImpl();
        int candidates,ctr=0,option,waitingRoom;
        boolean isIn=false;
        String inRoom=null;
        System.out.println("Enter the number of candidates : ");
        candidates=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names of candidates:");
        for (int i=0;i<candidates;i++)
        {
            queue.reception.add(sc.nextLine());
        }

        System.out.println("Enter no. of candidates in waiting room : ");
        waitingRoom=sc.nextInt();

        for (int i=0;i<waitingRoom;i++)
        {
            queue.waitingRoom.add(queue.reception.remove());
        }
        do {
            System.out.println("Enter your choice");
            option=sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("List of candidates in reception"+queue.reception);
                    System.out.println("List of candidates in waiting room"+queue.waitingRoom);
                    System.out.println("In Interview Room -->  "+inRoom);
                    break;

                case 2://nextcandidate
                    if(!isIn && !queue.waitingRoom.isEmpty())
                    {
                        isIn=!isIn;
                        inRoom=queue.waitingRoom.remove();
                        if(!queue.reception.isEmpty())
                        queue.waitingRoom.add(queue.reception.remove());
                        System.out.println(inRoom+" enters interview room");
                    }
                    else System.out.println("Candidate in Room");
                    break;

                case 3://send interviewee
                    if(isIn)
                    {
                        System.out.println(inRoom+" leaves interview room");
                        inRoom=null;
                        isIn=!isIn;
                        ctr++;
                    }
                    else System.out.println("No one in interview room");
            }

        }while (ctr<candidates);
        System.out.println("Interview Ends!!");
    }
}
