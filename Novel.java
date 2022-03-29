package mynovel;
import java.util.Scanner;
import java.util.Stack;

public class Novel {
    Scanner scanner=new Scanner(System.in);
    Stack<String> novelStack=new Stack<>();
    enum Language{
        ENGLISH("1.English"),TAMIL("2.Tamil"),EXIT("0.Exit");
        final String text;
        Language(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum EnglishGenre{
        CONTEMPORARY_ROMANCE("1.Contemporary Romance"),FICTION("2.Fiction"),FANTASY("3.Fantasy"),HISTORY("4.History"),HORROR("5.Horror"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        EnglishGenre(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum TamilGenre{
        KALAI("1.Kalai (Arts)"),VARALARU("2.Varalaru (History)"),ARIVIYAL("3.Ariviyal (Science)"),PUNAI_KATHAI("4.PunaiKathai (Fiction)"),THIGIL("5.Thigil (Horror)"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        TamilGenre(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum ContemporaryRomance
    {
        BOOK1("1.It Ends with Us"),BOOK2("2.Hating Game"),BOOK3("3.Terms and Conditions"),BOOK4("4.The Un-Honey Mooners"),BOOK5("5.A Girl Like Her"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        ContemporaryRomance(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Fiction
    {
        BOOK1("1.Wuthering Heights"),BOOK2("2.Mrs Dalloway"),BOOK3("3.The Catcher in the Rye"),BOOK4("4.Pride and Prejudice"),BOOK5("5.The Great Gatsby"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Fiction(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Fantasy
    {
        BOOK1("1.Valerain Empire"),BOOK2("2.Bambi and the Duke"),BOOK3("3.Heidi and the Lord"),BOOK4("4.Belle Adam's Buttler"),BOOK5("5.Young Master Damien's Pet"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Fantasy(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum History
    {
        BOOK1("1.Wolf Hall"),BOOK2("2.A Tale of Two Cities"),BOOK3("3.War and Peace"),BOOK4("4.The Name of the Rose"),BOOK5("5.Beloved"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        History(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Horror
    {
        BOOK1("1.The Haunting of Hill House"),BOOK2("2.Blood Roots"),BOOK3("3.Final Girls"),BOOK4("4.The Kids Aren't Alright"),BOOK5("5.Short and Sharp"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Horror(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Kalai
    {
        BOOK1("1.Kalachuvadugal"),BOOK2("2.Varnamalika"),BOOK3("3.Nadaga Medai Ninaivugal"),BOOK4("4.Kavin kalaigal"),BOOK5("5.Milir Kal"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Kalai(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Ariviyal
    {
        BOOK1("1.Inaiyilla Indhiya Ariviyal"),BOOK2("2.Moolakkanal"),BOOK3("3.Naveena Sinthnai vadivakkam"),BOOK4("4.Karnalin Narkali"),BOOK5("5.Puthumai Ulagam"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Ariviyal(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Varalaru
    {
        BOOK1("1.Ponniyin Selvan"),BOOK2("2.Udaiyar"),BOOK3("3.Vanji Mangaram"),BOOK4("4.Vengaiyin Maindhan"),BOOK5("5.Parthiban Kanavu"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Varalaru(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum PunaiKathai
    {
        BOOK1("1.Velai Vantha Pothu"),BOOK2("2.Thoondil Mul Valaivugal"),BOOK3("3.Iru Veru Ulagam"),BOOK4("4.Nanthi Nayagan"),BOOK5("5.Koogai"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        PunaiKathai(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    enum Thigil
    {
        BOOK1("1.Ullay Varathay"),BOOK2("2.23-Jannal"),BOOK3("3.Thigil Roja"),BOOK4("4.Mai-Irulin Athigaram"),BOOK5("5.Naan Mugam Paartha Kannadigal"),BACK("9.Back"),EXIT("0.Exit");
        final String text;
        Thigil(String text)
        {
            this.text=text;
        }
        String getText()
        {
            return text;
        }
    }

    void displayMenu(int page,int choice)
    {


        switch (page)
        {
            case 1:
            {
                switch (choice)
                {
                    case 1:
                        novelStack.push(Language.ENGLISH.getText());
                        System.out.println("Choose your Genre");
                        System.out.println(EnglishGenre.CONTEMPORARY_ROMANCE.getText());
                        System.out.println(EnglishGenre.FICTION.getText());
                        System.out.println(EnglishGenre.FANTASY.getText());
                        System.out.println(EnglishGenre.HISTORY.getText());
                        System.out.println(EnglishGenre.HORROR.getText());
                        System.out.println(EnglishGenre.BACK.getText());
                        System.out.println(EnglishGenre.EXIT.getText());
                        break;

                    case 2:
                        novelStack.push(Language.TAMIL.getText());
                        System.out.println("Ungalin Thervu --> Thalaipu");
                        System.out.println(TamilGenre.KALAI.getText());
                        System.out.println(TamilGenre.VARALARU.getText());
                        System.out.println(TamilGenre.ARIVIYAL.getText());
                        System.out.println(TamilGenre.PUNAI_KATHAI.getText());
                        System.out.println(TamilGenre.THIGIL.getText());
                        System.out.println(TamilGenre.BACK.getText());
                        System.out.println(TamilGenre.EXIT.getText());
                        break;
                }
            }
            break;

            case 2: {
                if(novelStack.peek().equals("1.English"))
                {
                    switch (choice) {
                        case 1:
                            novelStack.push(EnglishGenre.CONTEMPORARY_ROMANCE.getText());
                            System.out.println("Choose your Book");
                            System.out.println(ContemporaryRomance.BOOK1.getText());
                            System.out.println(ContemporaryRomance.BOOK2.getText());
                            System.out.println(ContemporaryRomance.BOOK3.getText());
                            System.out.println(ContemporaryRomance.BOOK4.getText());
                            System.out.println(ContemporaryRomance.BOOK5.getText());
                            System.out.println(ContemporaryRomance.BACK.getText());
                            System.out.println(ContemporaryRomance.EXIT.getText());
                            break;

                        case 2:
                            novelStack.push(EnglishGenre.FICTION.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Fiction.BOOK1.getText());
                            System.out.println(Fiction.BOOK2.getText());
                            System.out.println(Fiction.BOOK3.getText());
                            System.out.println(Fiction.BOOK4.getText());
                            System.out.println(Fiction.BOOK5.getText());
                            System.out.println(Fiction.BACK.getText());
                            System.out.println(Fiction.EXIT.getText());
                            break;

                        case 3:
                            novelStack.push(EnglishGenre.FANTASY.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Fantasy.BOOK1.getText());
                            System.out.println(Fantasy.BOOK2.getText());
                            System.out.println(Fantasy.BOOK3.getText());
                            System.out.println(Fantasy.BOOK4.getText());
                            System.out.println(Fantasy.BOOK5.getText());
                            System.out.println(Fantasy.BACK.getText());
                            System.out.println(Fantasy.EXIT.getText());
                            break;

                        case 4:
                            novelStack.push(EnglishGenre.HISTORY.getText());
                            System.out.println("Choose your Book");
                            System.out.println(History.BOOK1.getText());
                            System.out.println(History.BOOK2.getText());
                            System.out.println(History.BOOK3.getText());
                            System.out.println(History.BOOK4.getText());
                            System.out.println(History.BOOK5.getText());
                            System.out.println(History.BACK.getText());
                            System.out.println(History.EXIT.getText());
                            break;

                        case 5:
                            novelStack.push(EnglishGenre.HORROR.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Horror.BOOK1.getText());
                            System.out.println(Horror.BOOK2.getText());
                            System.out.println(Horror.BOOK3.getText());
                            System.out.println(Horror.BOOK4.getText());
                            System.out.println(Horror.BOOK5.getText());
                            System.out.println(Horror.BACK.getText());
                            System.out.println(Horror.EXIT.getText());
                            break;
                    }
                }
                else
                {
                    switch (choice) {
                        case 1:
                            novelStack.push(TamilGenre.KALAI.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Kalai.BOOK1.getText());
                            System.out.println(Kalai.BOOK2.getText());
                            System.out.println(Kalai.BOOK3.getText());
                            System.out.println(Kalai.BOOK4.getText());
                            System.out.println(Kalai.BOOK5.getText());
                            System.out.println(Kalai.BACK.getText());
                            System.out.println(Kalai.EXIT.getText());
                            break;

                        case 2:
                            novelStack.push(TamilGenre.ARIVIYAL.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Ariviyal.BOOK1.getText());
                            System.out.println(Ariviyal.BOOK2.getText());
                            System.out.println(Ariviyal.BOOK3.getText());
                            System.out.println(Ariviyal.BOOK4.getText());
                            System.out.println(Ariviyal.BOOK5.getText());
                            System.out.println(Ariviyal.BACK.getText());
                            System.out.println(Ariviyal.EXIT.getText());
                            break;

                        case 3:
                            novelStack.push(TamilGenre.VARALARU.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Varalaru.BOOK1.getText());
                            System.out.println(Varalaru.BOOK2.getText());
                            System.out.println(Varalaru.BOOK3.getText());
                            System.out.println(Varalaru.BOOK4.getText());
                            System.out.println(Varalaru.BOOK5.getText());
                            System.out.println(Varalaru.BACK.getText());
                            System.out.println(Varalaru.EXIT.getText());
                            break;

                        case 4:
                            novelStack.push(TamilGenre.PUNAI_KATHAI.getText());
                            System.out.println("Choose your Book");
                            System.out.println(PunaiKathai.BOOK1.getText());
                            System.out.println(PunaiKathai.BOOK2.getText());
                            System.out.println(PunaiKathai.BOOK3.getText());
                            System.out.println(PunaiKathai.BOOK4.getText());
                            System.out.println(PunaiKathai.BOOK5.getText());
                            System.out.println(PunaiKathai.BACK.getText());
                            System.out.println(PunaiKathai.EXIT.getText());
                            break;

                        case 5:
                            novelStack.push(TamilGenre.THIGIL.getText());
                            System.out.println("Choose your Book");
                            System.out.println(Thigil.BOOK1.getText());
                            System.out.println(Thigil.BOOK2.getText());
                            System.out.println(Thigil.BOOK3.getText());
                            System.out.println(Thigil.BOOK4.getText());
                            System.out.println(Thigil.BOOK5.getText());
                            System.out.println(Thigil.BACK.getText());
                            System.out.println(Thigil.EXIT.getText());
                            break;
                    }
                }
            }
            break;

            case 3:
                System.out.println("Thank you");
        }
    }

    void chooseOptions()
    {
        System.out.println("Welcome to WebNovel\nChoose your Language");
        System.out.println(Language.ENGLISH.getText());
        System.out.println(Language.TAMIL.getText());
        int option,menuPage=0;
        do{
            menuPage++;
            option=scanner.nextInt();
            if(option==9)
            {
                if(novelStack.isEmpty())
                    System.out.println("Thank you!!\nVisit Again!\n\n  --  WEBNOVEL");
                else{
                    novelStack.pop();
                    menuPage--;
                    displayMenu(menuPage,option);
                }
            }
            else if(option==0)
            {
                System.out.println("Thank you!!\nVisit Again!\n\n  --  WEBNOVEL");
                System.exit(0);
            }
            else {
                displayMenu(menuPage,option);
            }
        }while (menuPage<3);
        System.out.println(novelStack);
    }
    public static void main(String[] args)
    {
        Novel obj=new Novel();
        obj.chooseOptions();
    }
}
