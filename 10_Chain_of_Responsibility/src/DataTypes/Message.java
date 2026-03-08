package DataTypes;

import java.util.Scanner;

public class Message
{
    private MessageType type;
    private String content;
    private String email;

    public Message(MessageType type, String content, String email)
    {
        this.type = type;
        this.content = content;
        this.email = email;
    }

    public Message()
    {
        Scanner input = new Scanner(System.in);
        String inStr;

        do
        {
            System.out.println("Please choose the reason of the message through the below list :");
            System.out.println("1. Compensation claim");
            System.out.println("2. Contact request");
            System.out.println("3. Development suggestion");
            System.out.println("4. General feedback");
            System.out.print("Please enter the number of your desired reason :\n> ");
            inStr = input.nextLine();
        } while (!(inStr.equals("1") || inStr.equals("2") || inStr.equals("3") || inStr.equals("4")));
        type = switch (inStr)
        {
            case "1" -> MessageType.COMPENSATION_CLAIM;
            case "2" -> MessageType.CONTACT_REQUEST;
            case "3" -> MessageType.DEVELOPMENT_SUGGESTION;
            default -> MessageType.GENERAL_FEEDBACK;
        };

        System.out.print("\nPlease give us the detail of the message (press enter when you have finished) :\n> ");
        content = input.nextLine();

        System.out.print("\nPlease give us your email for us to answer your message as quickly as possible :\n> ");
        email = input.nextLine();
    }

    public MessageType getType() {return type;}
    public String getContent() {return content;}
    public String getEmail() {return email;}
}
