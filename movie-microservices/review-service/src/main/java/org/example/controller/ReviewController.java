package org.example.controller;

import org.example.domain.Review;
import org.example.dto.ReviewDto;
import org.example.service.CustomerService;
import org.example.service.MovieService;
import org.example.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reviews")
public class ReviewController {


    private ReviewService reviewService;

    private MovieService movieService;
    private CustomerService customerService;

    public ReviewController(ReviewService reviewService,MovieService movieService,CustomerService customerService){
        this.customerService=customerService;
        this.movieService=movieService;
        this.reviewService=reviewService;
    }


    @PostMapping
    public ResponseEntity<ReviewDto> createReview(@RequestBody ReviewDto review) {
        var reviewEntity = toEntity(review);
        var movie = movieService.findById(review.movieId());
        var customer = customerService.findByEmail(review.reviewer());
        if (movie.isEmpty() || customer.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        var createdReview = reviewService.createReview(reviewEntity);
        return ResponseEntity.ok(toDto(createdReview));
    }

    @GetMapping("/id/{movieId}")
    public ResponseEntity<List<ReviewDto>> getReviewByMovieId(@PathVariable int movieId) {
        var review = reviewService.getReviewByMovieId(movieId);
        if (review.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(review.stream().map(this::toDto).toList());
    }

    @GetMapping("/reviewer/{reviewer}")
    public ResponseEntity<List<ReviewDto>> getReviewByReviewer(@PathVariable String reviewer) {
        var review = reviewService.getReviewByReviewer(reviewer);
        if (review.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(review.stream().map(this::toDto).toList());
    }



    private Review toEntity(ReviewDto reviewDto) {
        return new Review(reviewDto.movieId(),reviewDto.review(),reviewDto.reviewer(),reviewDto.rating());
    }

    private ReviewDto toDto(Review review) {
        return new ReviewDto(review.getMovieId(), review.getReview(), review.getReviewer(), review.getRating());
    }

}
