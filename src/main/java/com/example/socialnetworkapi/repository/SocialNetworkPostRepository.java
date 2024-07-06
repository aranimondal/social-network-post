public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {
    List<SocialNetworkPost> findByPostCategoryOrderByViewCountDesc(String postCategory);
    List<SocialNetworkPost> findByAuthor(String author);
}
