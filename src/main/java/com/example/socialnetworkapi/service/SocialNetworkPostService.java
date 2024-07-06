import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.socialnetworkapi.model.SocialNetworkPost;
import com.example.socialnetworkapi.repository.SocialNetworkPostRepository; 

@Service
public class SocialNetworkPostService {

  @Autowired
  private SocialNetworkPostRepository repository;

  public List<SocialNetworkPost> getTopPostsByCategory(String postCategory) {
    return repository.findByPostCategoryOrderByViewCountDesc(postCategory).stream()
        .limit(10)
        .collect(Collectors.toList());
  }

  public List<SocialNetworkPost> searchPostsByAuthor(String author) {
    return repository.findByAuthor(author);
  }
}
