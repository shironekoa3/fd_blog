package store.longyan.domain;

public class Tagmeta {

    private int tagmeta_id;
    private int article_id;
    private int tag_id;

    public Tagmeta(int article_id, int tag_id) {
        this.article_id = article_id;
        this.tag_id = tag_id;
    }

    public int getTagmeta_id() {
        return tagmeta_id;
    }

    public void setTagmeta_id(int tagmeta_id) {
        this.tagmeta_id = tagmeta_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }


    @Override
    public String toString() {
        return "Tagmeta{" +
                "tagmeta_id=" + tagmeta_id +
                ", article_id=" + article_id +
                ", tag_id=" + tag_id +
                '}';
    }
}
