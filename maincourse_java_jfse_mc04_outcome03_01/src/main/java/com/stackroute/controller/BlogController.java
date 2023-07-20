package com.stackroute.controller;

import com.stackroute.domain.Blog;

import com.stackroute.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
/* Add annotation to declare this class as REST Controller */
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/blog")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        var post = blogService.getBlogById(blog.getBlogId());
        if (post != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(blogService.saveBlog(blog));
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        return new ResponseEntity<List<Blog>>((List<Blog>) blogService.getAllBlogs(), HttpStatus.OK);
    }

    @GetMapping("/blog/{blogId}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int blogId) {
        Blog result=blogService.getBlogById(blogId);
        if(result==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(result);

    }

    @DeleteMapping("/blog/{blogId}")
    public ResponseEntity<Blog> getBlogAfterDeleting(@PathVariable int blogId) {
        blogService.deleteBlog(blogId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/blog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        if (blog != null) {
            final var blogs = blogService.getBlogById(blog.getBlogId());
            if (blogs == null) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            blogs.setBlogId(blog.getBlogId());
            blogs.setBlogContent(blog.getBlogContent());
            blogs.setBlogTitle(blog.getBlogTitle());
            blogs.setAuthorName(blog.getAuthorName());
            final var result = blogService.updateBlog(blogs);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
