package com.spring.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    AnimalDAO animalDAO;

    @Override
    public int insertAnimal(AnimalVO vo){
        return animalDAO.insertAnimal(vo);
    }

    @Override
    public int deleteAnimal(int animalId){
        return animalDAO.deleteAnimal(animalId);
    }

    @Override
    public int updateAnimal(AnimalVO vo){
        return animalDAO.updateAnimal(vo);
    }

    @Override
    public AnimalVO getAnimal(int animalId){return animalDAO.getAnimal(animalId);}

    @Override
    public List<AnimalVO> getAnimalList(){
        return animalDAO.getAnimalList();
    }
}
