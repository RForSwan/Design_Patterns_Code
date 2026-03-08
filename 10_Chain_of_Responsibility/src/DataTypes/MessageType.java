package DataTypes;

public enum MessageType
{
    COMPENSATION_CLAIM,
    CONTACT_REQUEST,
    DEVELOPMENT_SUGGESTION,
    GENERAL_FEEDBACK
}


/*

Create different handler classes for handling different forms of customer feedback.
Each handler class is responsible for handling one form of feedback.
Chain the handler classes together using the Chain of Responsibility pattern.
This allows the feedback to be automatically routed to the correct handler.
Each handler should define how it handles a particular type of feedback.

For example,
compensation claims can be reviewed and approved or rejected,
contact requests can be forwarded to the appropriate department,
development suggestions can be logged and prioritized,
and general feedback can be analyzed and responded to.

 */