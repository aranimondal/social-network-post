package com.example.socialnetwork.repository;

import com.example.socialnetwork.entity.SocialNetworkPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SocialNetworkPostRepositoryTest {

    @Autowired
    private SocialNetworkPostRepository repository;

    @Test
    public void testFindTop10ByPostCategoryOrderByViewCountDesc() {
        List<SocialNetworkPost> posts = repository.findTop10ByPostCategoryOrderByViewCountDesc("Music");
        assertFalse(posts.isEmpty());
        assertEquals(10, posts.size());
    }

    @Test
    public void testFindByAuthor() {
        List<SocialNetworkPost> posts = repository.findByAuthor("Alice");
        assertFalse(posts.isEmpty());
        assertEquals("Alice", posts.get(0).getAuthor());
    }
}
