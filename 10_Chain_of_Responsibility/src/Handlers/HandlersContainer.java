package Handlers;

import Handlers.SpecializedHandlers.*;
import DataTypes.Message;


public class HandlersContainer extends Handler
{
    private Handler[] handlers = new Handler[]
            {new CompensationClaimHandler(),
            new ContactRequestHandler(),
            new DevelopmentSuggestionHandler(),
            new GeneralFeedbackHandler()};

    @Override
    public boolean handleMessage(Message message) {
        for(Handler handler : handlers)
        {
            if(handler.handleMessage(message)) return true;
        }
        return false;
    }
}
