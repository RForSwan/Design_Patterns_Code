package Handlers.SpecializedHandlers;

import DataTypes.*;
import Handlers.Handler;

public class CompensationClaimHandler extends Handler
{
    @Override
    public boolean handleMessage(Message message)
    {
        if(message.getType() != MessageType.COMPENSATION_CLAIM) return false;
        System.out.println("The message has been dealt as a compensation claim.");
        System.out.println("It will be reviewed and if approved, compensation will be sent.");
        return true;
    }
}
