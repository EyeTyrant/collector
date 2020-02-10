package com.eyetyrantdesign.collector.controllers;

import com.eyetyrantdesign.collector.models.Item;
import com.eyetyrantdesign.collector.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CollectorController {

  @Autowired
  private ItemRepository itemRepository;


  @RequestMapping("")
  @ResponseBody
  public String index(){
    return "index";
  }



  @GetMapping("listall")
  @ResponseBody
  public Iterable<Item> listAll(){

    return itemRepository.findAll();
  }

  @GetMapping("listall/{id}")
  @ResponseBody
  public Optional<Item> getItemById(@PathVariable Integer id){
    return itemRepository.findById(id);
  }

  @PostMapping("add")
  public  addItem(){
    return "redirect:";
  }

}
