package Handlers.SpecializedHandlers;

import DataTypes.Message;
import DataTypes.MessageType;
import Handlers.Handler;

public class ContactRequestHandler extends Handler
{
    @Override
    public boolean handleMessage(Message message)
    {
        if(message.getType() != MessageType.CONTACT_REQUEST) return false;
        System.out.println("The message has been dealt as a contact request.");
        System.out.println("It will be forwarded to the appropriate department.");
        return true;
    }
}
