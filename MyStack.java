import java.util.Scanner;
import java.util.Stack;

public class MyStack
{
    Scanner sc=new Scanner(System.in);
    Stack<String> stack=new Stack<>();
    public void selectLanguage()
    {
        System.out.println("Select a Language\n1.English\n2.Tamil");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("English");
                selectEnglishGenre();
                break;

            case 2:
                stack.push("Tamil");
                selectTamilGenre();
                break;
        }
    }

    public void selectEnglishGenre()
    {
        System.out.println("Select a Genre\n1.Fiction\n2.Thriller\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("Fiction");
                selectFictionBook();
                break;

            case 2:
                stack.push("Thriller");
                selectThrillerBook();
                break;

            case 0:
                stack.pop();
                selectLanguage();
                break;
        }
    }

    public void selectThrillerBook()
    {
        System.out.println("Select your book\n1.The Guest List\n2.Blow the man down\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("The Guest List");
                break;

            case 2:
                stack.push("Blow the man down");
                break;

            case 0:
                stack.pop();
                selectEnglishGenre();
                break;
        }
    }

    public void selectFictionBook()
    {
        System.out.println("Select your Book\n1.Pride and Prejudice\n2.Beloved\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("Pride and Prejudice");
                break;

            case 2:
                stack.push("Beloved");
                break;

            case 0:
                stack.pop();
                selectEnglishGenre();
                break;
        }
    }

    public void selectTamilGenre()
    {
        System.out.println("Thervu Seiga (Thalaippu) \n1.Varalaru\n2.Thigil\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("Varalaru");
                selectVaralaruBook();
                break;

            case 2:
                stack.push("Thigil");
                selectThigilBook();
                break;

            case 0:
                stack.pop();
                selectLanguage();
                break;
        }
    }

    public void selectThigilBook()
    {
        System.out.println("Thervu Seiga\n1.Pathimoondram Pakkam\n2.Mai-Irulin Athigaram\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("Pathimoondram Pakkam");
                break;

            case 2:
                stack.push("Mai-Irulin Athigaram");
                break;

            case 0:
                stack.pop();
                selectTamilGenre();
                break;
        }
    }

    public void selectVaralaruBook()
    {
        System.out.println("Thervu Seiga (Puthagam)\n1.Ponniyin Selvan\n2.Udaiyar\n0.Back");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                stack.push("Ponniyin Selvan");
                break;

            case 2:
                stack.push("Udaiyar");
                break;

            case 0:
                stack.pop();
                selectTamilGenre();
                break;
        }
    }
    public static void main(String[] args)
    {
        MyStack stackObj=new MyStack();
        stackObj.selectLanguage();
        System.out.println(stackObj.stack);
    }
}


