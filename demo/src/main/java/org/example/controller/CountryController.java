package org.example.controller;

import org.example.domain.Country;
import org.example.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("")
    public ResponseEntity<List<Country>> getAll(){
        var all=countryRepository.findAll();
        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(all);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable int id){
        Optional<Country> one= countryRepository.findById(id);
        if(one.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(one.get());
    }
    @PostMapping("")
    public ResponseEntity<Country> create(@RequestBody Country country){
        var post=countryRepository.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Country>> delete(@PathVariable int id){
        var del=countryRepository.findById(id);
        if(del.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        countryRepository.deleteById(id);
        return ResponseEntity.ok().body(countryRepository.findAll());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Country> update(@PathVariable int id,@RequestBody Country country){
        var find=countryRepository.findById(id);
        if(find.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        var existing=find.get();
        existing.setId(country.getId());
        existing.setName(country.getName());
        countryRepository.save(existing);
        return ResponseEntity.ok().body(existing);
    }
}
