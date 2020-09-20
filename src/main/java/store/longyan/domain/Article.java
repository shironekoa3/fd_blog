package store.longyan.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Article  implements Serializable {
    private int article_id;
    private String article_title;
    private Date article_date;
    private int click_count;
    private int like_count;
    private int comment_count;
    private boolean comment_status;
    private int category_id;
    private String content;
    private boolean is_top;
    private String article_image;

    private Category category;
    private List<Tag> tagList;


    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public Date getArticle_date() {
        return article_date;
    }

    public void setArticle_date(Date article_date) {
        this.article_date = article_date;
    }

    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public boolean isComment_status() {
        return comment_status;
    }

    public void setComment_status(boolean comment_status) {
        this.comment_status = comment_status;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIs_top() {
        return is_top;
    }

    public void setIs_top(boolean is_top) {
        this.is_top = is_top;
    }

    public String getArticle_image() {
        return article_image;
    }

    public void setArticle_image(String article_image) {
        this.article_image = article_image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_title='" + article_title + '\'' +
                ", article_date=" + article_date +
                ", click_count=" + click_count +
                ", like_count=" + like_count +
                ", comment_count=" + comment_count +
                ", comment_status=" + comment_status +
                ", category_id=" + category_id +
                ", content='" + content + '\'' +
                ", is_top=" + is_top +
                ", article_image='" + article_image + '\'' +
                ", category=" + category +
                ", tagList=" + tagList +
                '}';
    }
}
