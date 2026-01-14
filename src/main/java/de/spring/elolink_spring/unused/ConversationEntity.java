package de.spring.elolink_spring.unused;

public class ConversationEntity {

    String uuid1;
    String uuid2;

    public ConversationEntity(){
    }

    public String getUuid1() {
        return uuid1;
    }

    public void setUuid1(String uuid1) {
        this.uuid1 = uuid1;
    }

    public String getUuid2() {
        return uuid2;
    }

    public void setUuid2(String uuid2) {
        this.uuid2 = uuid2;
    }

    @Override
    public String toString() {
        return "ConversationEntity{" +
                "uuid1='" + uuid1 + '\'' +
                ", uuid2='" + uuid2 + '\'' +
                '}';
    }
}
