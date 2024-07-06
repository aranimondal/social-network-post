package com.example.socialnetwork.controller;

import com.example.socialnetwork.entity.SocialNetworkPost;
import com.example.socialnetwork.service.SocialNetworkPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SocialNetworkPostController.class)
public class SocialNetworkPostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SocialNetworkPostService service;

    @Test
    public void testGetTop10PostsByCategory() throws Exception {
        when(service.getTop10PostsByCategory(anyString())).thenReturn(Collections.singletonList(new SocialNetworkPost()));

        mockMvc.perform(get("/api/posts/top10/Music"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());

        verify(service, times(1)).getTop10PostsByCategory("Music");
    }

    @Test
    public void testGetPostsByAuthor() throws Exception {
        when(service.getPostsByAuthor(anyString())).thenReturn(Collections.singletonList(new SocialNetworkPost()));

        mockMvc.perform(get("/api/posts/author/Alice"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());

        verify(service, times(1)).getPostsByAuthor("Alice");
    }
}
