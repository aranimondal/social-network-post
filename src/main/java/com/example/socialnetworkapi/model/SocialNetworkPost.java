
@Entity
public class SocialNetworkPost {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date postDate;
  private String postCategory;
  private String author;
  private String content;
  private Long viewCount;

  // Getters
  public Long getId() {
    return id;
  }

  public Date getPostDate() {
    return postDate;
  }

  public String getPostCategory() {
    return postCategory;
  }

  public String getAuthor() {
    return author;
  }

  public String getContent() {
    return content;
  }

  public Long getViewCount() {
    return viewCount;
  }

  // Setters
  public void setId(Long id) {
    this.id = id;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }

  public void setPostCategory(String postCategory) {
    this.postCategory = postCategory;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setViewCount(Long viewCount) {
    this.viewCount = viewCount;
  }
}
