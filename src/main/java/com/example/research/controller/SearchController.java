package com.example.research.controller;


import com.example.research.service.CustomerService;
import com.example.research.service.CustomerServiceImpl;
import org.jooq.sources.tables.pojos.Companies;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;
import org.zkoss.zul.ext.Selectable;

import java.util.List;
import java.util.Set;

public class SearchController extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;


    @Wire
    private Textbox keywordBox;

    @Wire
    private Listbox customersListbox;

    @Wire
    private Label idLabel;

    @Wire
    private Label nameLabel;

    @Wire
    private Label positionLabel;

    @Wire
    private Component detailBox;

    private CustomerService customerService = new CustomerServiceImpl();


   @Listen("onClick = #searchButton")
   public void search(){
       String keyword = keywordBox.getValue();
       List<Companies> result = customerService.search(keyword);
       customersListbox.setModel(new ListModelList<Companies>(result));
   }

   @Listen("onSelect = #customersListbox")
    public void showDetail(){
       detailBox.setVisible(true);

       Set<Companies> selection = ((Selectable<Companies>)customersListbox.getModel()).getSelection();
       if(selection != null && !selection.isEmpty()){
           Companies selected = selection.iterator().next();
           idLabel.setValue(selected.getId().toString());
           nameLabel.setValue(selected.getName());

           positionLabel.setValue(selected.getPosition().toText());
       }
   }


}
