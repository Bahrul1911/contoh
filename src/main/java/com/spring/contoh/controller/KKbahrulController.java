package com.spring.contoh.controller;


import com.spring.contoh.model.Kkbahrul;
import com.spring.contoh.repo.KkbahrulRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("test")

public class KKbahrulController {
    @Autowired
    private KkbahrulRepo repo;

    @GetMapping
    public List<Kkbahrul> getall() {return repo.getall();}

    @GetMapping("/{id}")
    public Kkbahrul getcontoh(@PathVariable("id") String nik) {return repo.get(nik);}

    @PostMapping
    public ResponseEntity<Void> simpan (@RequestBody Kkbahrul b, HttpServletRequest req, HttpServletResponse res, UriComponentsBuilder uri) {
        repo.tambah(b);
        HttpHeaders h=new HttpHeaders();
        return new ResponseEntity<Void>(h, HttpStatus.CREATED);
    }
    @PostMapping("/update")
    public ResponseEntity<Void> update (@RequestBody Kkbahrul b, HttpServletRequest req, HttpServletResponse res, UriComponentsBuilder uri) {
        repo.update (b);
        HttpHeaders h=new HttpHeaders();
        return new ResponseEntity<Void>(h, HttpStatus.CREATED);
    }
}
