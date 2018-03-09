package com.example.research.service;

import org.jooq.sources.tables.pojos.Companies;

import java.util.List;

public interface CustomerService {

    public List<Companies> findAll();




    List<Companies> search(String keyword);

}
