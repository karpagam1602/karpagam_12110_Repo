package com.pet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pet.bean.Appointment;

import com.pet.controller.AppointmentController;
import com.pet.controller.PetController;
import com.pet.controller.UserController;

@SpringBootTest
class AppointmentMyTest {

	@Autowired
	AppointmentController appcontroller;

	@Autowired
	PetController petcontroller;

	@Autowired
	UserController usercontroller;

	List<Appointment> list = new ArrayList<Appointment>();
	List<Integer> list1 = new ArrayList<Integer>();

    // to get all details of Users
	@Test
	void getAllApps() {

		list = appcontroller.getAppointments();
		System.out.println(list);
		assertNotNull(list);
	}

	// to get all Id
	@Test
	void getAppIdList() {
		list1 = appcontroller.getapps();

		System.out.println(list1);
		assertNotNull(list1);

	}

}
