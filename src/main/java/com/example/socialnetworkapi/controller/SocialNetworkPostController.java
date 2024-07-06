import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.socialnetworkapi.model.SocialNetworkPost;
import com.example.socialnetworkapi.service.SocialNetworkPostService;

@RestController
@RequestMapping("/api")
public class SocialNetworkPostController {

  @Autowired
  private SocialNetworkPostService service;

  @GetMapping("/top-posts/{category}")
  public List<SocialNetworkPost> getTopPostsByCategory(@PathVariable String category) {
    return service.getTopPostsByCategory(category);
  }

  @GetMapping("/search/{author}")
  public List<SocialNetworkPost> searchPostsByAuthor(@PathVariable String author) {
    return service.searchPostsByAuthor(author);
  }
}
