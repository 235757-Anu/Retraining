package org.example.service;

import org.example.domain.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(Review review);

    List<Review> getReviewByMovieId(int id);

    List<Review> getReviewByReviewer(String reviewer);

}
