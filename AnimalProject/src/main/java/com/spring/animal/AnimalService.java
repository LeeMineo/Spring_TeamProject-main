package com.spring.animal;

import java.util.List;

public interface AnimalService {
    public int insertAnimal(AnimalVO vo);
    public int deleteAnimal(int animalId);
    public int updateAnimal(AnimalVO vo);
    public AnimalVO getAnimal(int animalId);
    public List<AnimalVO> getAnimalList();
}
