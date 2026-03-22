package Handlers;

import DataTypes.Message;

public abstract class Handler
{
        public abstract boolean handleMessage(Message message);
}
