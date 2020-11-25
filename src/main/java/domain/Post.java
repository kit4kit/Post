package domain;

public class Post {
    private int id; // id поста
    private int ownerId; // id владельца стены
    private int fromId; // id владельца поста
    private int date; // дата публикации
    private String text; // текст записи
    private int createdBy; // идентификатор администратора
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private int  friendsOnly; // 1, если запись была создана с опцией «Только для друзей»
    private String copyright; // источник материала.
    private String postType;


    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private Reposts reposts;
    private Views views;
    private Donut donut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts){
        this.reposts = reposts;
    }
}
