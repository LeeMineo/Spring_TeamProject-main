package com.spring.animal;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalDAO {
	@Autowired
	SqlSession sqlSession;

	//글 추가
	public int insertAnimal(AnimalVO vo) {
		int result = sqlSession.insert("Animal.insertAnimal", vo);
		return result;
	}

	// 글 삭제
	public int deleteAnimal(int id) {
		int count = sqlSession.delete("Animal.deleteAnimal", id);
		return count;
	}

	//글 수정
	public int updateAnimal(AnimalVO vo) {
		int change = sqlSession.update("Animal.updateAnimal", vo);
		return change;
	}

	//원하는 데이터 하나 정보
	public AnimalVO getAnimal(int animalId) {
		AnimalVO one = sqlSession.selectOne("Animal.getAnimal", animalId);
		return one;
	}

	//데이터 리스트 전체 정보
	public List<AnimalVO> getAnimalList() {
		List<AnimalVO> list = sqlSession.selectList("Animal.getAnimalList");
		return list;
	}
}

