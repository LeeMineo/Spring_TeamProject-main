package com.spring.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/animal")
public class AnimalController {
    @Autowired
    AnimalServiceImpl animalService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String animallist(Model model){
        model.addAttribute("list", animalService.getAnimalList());
        return "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addPostOK(AnimalVO vo){
        if(animalService.insertAnimal(vo) == 0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공");
        return "redirect:list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model){
        AnimalVO animalVO = animalService.getAnimal(id);
        model.addAttribute("u", animalVO);
        return "editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editPostOk(AnimalVO vo){
        if(animalService.updateAnimal(vo) == 0) System.out.println("데이터 수정 실패");
        else System.out.println("데이터 수정 성공");
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
    public String deletePostOk(@PathVariable("id") int id){
        if(animalService.deleteAnimal(id) == 0) System.out.println("데이터 삭제 실패");
        else System.out.println("데이터 삭제 성공");
        return "redirect:../list";
    }
}
