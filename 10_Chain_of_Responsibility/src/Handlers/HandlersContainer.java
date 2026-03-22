package Handlers;

import Handlers.SpecializedHandlers.*;
import DataTypes.Message;

import java.util.ArrayList;
import java.util.List;


public class HandlersContainer extends Handler
{
    private List<Handler> handlers = new ArrayList<>();
//    private Handler[] handlers = new Handler[]
//            {new CompensationClaimHandler(),
//            new ContactRequestHandler(),
//            new DevelopmentSuggestionHandler(),
//            new GeneralFeedbackHandler()};

    @Override
    public boolean handleMessage(Message message) {
        for(Handler handler : handlers)
        {
            if(handler.handleMessage(message)) return true;
        }
        return false;
    }

    public void addHandler(Handler handler)
    {
        handlers.add(handler);
    }
}
