package in.stackroute.springrestjpacodingchallenge.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {
    @Id
    private int feedbackId;
    private String comment;
    @OneToOne
    private Product product;
    @OneToOne
    private User user;

    public Feedback(int feedbackId, String comment, Product product, User user) {
        this.feedbackId = feedbackId;
        this.comment = comment;
        this.product = product;
        this.user = user;
    }
    public Feedback(){

    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
