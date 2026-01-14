package de.spring.elolink_spring.rest.dto;


public class ChatDto {

    private String sender;
    private String receiver;
    private String message;

    public ChatDto(){
    }

    public ChatDto(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    /*
        public static ChatDto fromChat(Chat chat){
            return new ChatDto("true",
                    chat.getSender(),
                    chat.getReceiver(),
                    chat.getMessage(),
                    chat.getAesKeyRec(),
                    chat.getAesKeyOwn(),
                    chat.getSpec(),
                    chat.getTimestamp()
            );
        }
    */

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChatDto{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
