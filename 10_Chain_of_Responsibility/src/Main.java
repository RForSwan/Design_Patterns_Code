import Handlers.*;
import Handlers.SpecializedHandlers.*;
import DataTypes.*;

void main()
{
    HandlersContainer handlers = new HandlersContainer();
    handlers.addHandler(new CompensationClaimHandler());
    handlers.addHandler(new ContactRequestHandler());
    handlers.addHandler(new DevelopmentSuggestionHandler());
    handlers.addHandler(new GeneralFeedbackHandler());

    Message m1 = new Message(
            MessageType.COMPENSATION_CLAIM,
            "Bad experience due to ... I want a full refund",
            "user1@app.com");

    Message m2 = new Message(
            MessageType.CONTACT_REQUEST,
            "I would like to speak to dev team regarding ...",
            "user2@app.com");

    Message m3 = new Message(
            MessageType.DEVELOPMENT_SUGGESTION,
            "I saw that you currently don't have [element] available",
            "user3@app.com");

    Message m4 = new Message(
            MessageType.GENERAL_FEEDBACK,
            "I want to say that your website is really cool",
            "user4@app.com");

    handlers.handleMessage(m1);
    handlers.handleMessage(m2);
    handlers.handleMessage(m3);
    handlers.handleMessage(m4);
}
