package Handlers.SpecializedHandlers;

import DataTypes.Message;
import DataTypes.MessageType;
import Handlers.Handler;

public class DevelopmentSuggestionHandler extends Handler
{
    @Override
    public boolean handleMessage(Message message)
    {
        if(message.getType() != MessageType.DEVELOPMENT_SUGGESTION) return false;
        System.out.println("The message has been dealt as a development suggestion.");
        System.out.println("It will be logged and prioritized.");
        return true;
    }
}
