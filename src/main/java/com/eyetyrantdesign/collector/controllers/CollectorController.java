package com.eyetyrantdesign.collector.controllers;

import com.eyetyrantdesign.collector.models.DieCast;
import com.eyetyrantdesign.collector.models.data.DieCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CollectorController {

  @Autowired
  private DieCastRepository dieCastRepository;


  @RequestMapping("")
  @ResponseBody
  public String index(){
    return "index";
  }



  @GetMapping("list")
  @CrossOrigin(origins = "http://localhost:4200")
  @ResponseBody
  public Iterable<DieCast> listAll(){

    return dieCastRepository.findAll();
  }

  @GetMapping("list/{id}")
  @CrossOrigin(origins = "http://localhost:4200")
  @ResponseBody
  public Optional<DieCast> getItemById(@PathVariable Integer id){
    return dieCastRepository.findById(id);
  }

  @PostMapping("add")
  @CrossOrigin(origins = "http://localhost:4200")
  public DieCast addItem(@ModelAttribute Model model){
    model.addAttribute(new DieCast());
    DieCast newDieCast = new DieCast();
    newDieCast.setName("White Lightning");
    newDieCast.setMfr("Tyco");
    newDieCast.setBrand("Matchbox");
    newDieCast.setYear(1974);
    newDieCast.toString();
    return dieCastRepository.save(newDieCast);
  }

}
