package com.pet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pet.bean.Pet;
import com.pet.controller.PetController;


@SpringBootTest
class PetMyTest {

	@Autowired
	PetController petcontroller;

	List<Pet> list = new ArrayList<Pet>();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Pet> list2 = new ArrayList<Pet>();

	// to get all details of pets
	@Test
	void getAllPets() {

		list = petcontroller.getPets();
		System.out.println(list);
		assertNotNull(list);
	}

	// to get all Id
	@Test
	void getPetIdList() {
		list1 = petcontroller.allpets();

		System.out.println(list1);
		assertNotNull(list1);

	}

	// get by petName(search)
	@Test
	void getListByPetName() {
		list2 = petcontroller.getByName("jo");
		System.out.println(list2);
		assertNotNull(list2);

	}

}