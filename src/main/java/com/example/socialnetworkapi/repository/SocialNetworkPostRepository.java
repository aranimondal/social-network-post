import org.springframework.data.jpa.repository.JpaRepository;
import com.example.socialnetworkapi.model.SocialNetworkPost;

public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {

  List<SocialNetworkPost> findByPostCategoryOrderByViewCountDesc(String postCategory);

  List<SocialNetworkPost> findByAuthor(String author);
}
