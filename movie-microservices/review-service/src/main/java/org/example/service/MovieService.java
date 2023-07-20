package org.example.service;

import org.example.dto.MovieDto;

import java.util.Optional;

public interface MovieService {
    Optional<MovieDto> findById(int id);
}
