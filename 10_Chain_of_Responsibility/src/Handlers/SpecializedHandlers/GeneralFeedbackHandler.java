package Handlers.SpecializedHandlers;

import DataTypes.Message;
import DataTypes.MessageType;
import Handlers.Handler;

public class GeneralFeedbackHandler extends Handler
{
    @Override
    public boolean handleMessage(Message message)
    {
        if(message.getType() != MessageType.GENERAL_FEEDBACK) return false;
        System.out.println("The message has been dealt as a general feedback.");
        System.out.println("It will be analyzed and answered.");
        return true;
    }
}
