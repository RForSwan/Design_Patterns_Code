package Handlers;

import DataTypes.Message;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler
{
    public List<Handler> handlers = new ArrayList<>();

    public abstract boolean handleMessage(Message message);

}
