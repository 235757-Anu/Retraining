package org.example.service;

import org.example.dto.MovieDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private String url = "http://MOVIE-SERVICE/api/v1/movies/{id}";
    private RestTemplate restTemplate;
    public MovieServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Optional<MovieDto> findById(int id) {
        try{
            final var response =  restTemplate.getForEntity(url, MovieDto.class, id);
            if(response.getStatusCode().is2xxSuccessful()){
                var body = response.getBody();
                return Optional.ofNullable(body);
            }
            return Optional.empty();
        }catch (Exception e){
            return Optional.empty();
        }
    }
}
