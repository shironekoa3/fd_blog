package store.longyan.domain;

import java.io.Serializable;
import java.util.Date;

public class Article  implements Serializable {
    private Integer article_id;
    private String article_title;
    private Date article_date;
    private Integer click_count;
    private Integer like_count;
    private Integer comment_count;
    private Integer comment_status;
    private Integer category_id;
    private String content;
    private Integer is_top;
    private String article_image;

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
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

    public Integer getClick_count() {
        return click_count;
    }

    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getComment_status() {
        return comment_status;
    }

    public void setComment_status(Integer comment_status) {
        this.comment_status = comment_status;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIs_top() {
        return is_top;
    }

    public void setIs_top(Integer is_top) {
        this.is_top = is_top;
    }

    public String getArticle_image() {
        return article_image;
    }

    public void setArticle_image(String article_image) {
        this.article_image = article_image;
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
                '}';
    }
}
