package com.example.research.service;

import com.example.research.util.DatasourceConfig;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.sources.tables.pojos.Companies;
import org.jooq.sources.tables.records.CompaniesRecord;


import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.sources.tables.Companies.COMPANIES;

public class CustomerServiceImpl implements CustomerService {

    DataSource dataSource = DatasourceConfig.createDataSource();

    public List<Companies> findAll() {
        SelectWhereStep<CompaniesRecord> companiesRecords = DSL.using(dataSource, POSTGRES)
                .selectFrom(COMPANIES);
        List<Companies> companiesList = new ArrayList<>();
        companiesRecords.forEach(s ->companiesList.add(new Companies(s.getId(), s.getName(), s.getPosition())));
        return companiesList;
    }

    public List<Companies> search(String keyword) {
        SelectConditionStep<CompaniesRecord> companiesRecords = DSL.using(dataSource, POSTGRES).selectFrom(COMPANIES).where(COMPANIES.NAME.like('%' + keyword + '%'));
        List<Companies> companiesList = new ArrayList<>();
        companiesRecords.forEach(s ->companiesList.add(new Companies(s.getId(), s.getName(), s.getPosition())));
        return companiesList;
    }
}
