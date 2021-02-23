package com.ubs.teste.apiweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ubs.teste.apiweb.dto.ProductDTO;
import com.ubs.teste.apiweb.model.Prod;
import com.ubs.teste.apiweb.service.ProductService;

@RestController
@RequestMapping("/read")
public class ReadController {

    private static Logger logger = LoggerFactory.getLogger(ReadController.class);

    @Autowired
    private ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(ProductDTO productDTO) {
        logger.info("Starting the Save method");
        productService.read();

    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Prod> listar(ProductDTO productDTO) {

        return productService.findAll();
    }

}
