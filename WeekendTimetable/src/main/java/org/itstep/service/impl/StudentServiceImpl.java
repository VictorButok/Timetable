package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.StudentDAO;
import org.itstep.model.Group;
import org.itstep.model.Student;
import org.itstep.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDao;
	
	public Student save(Student student) {
		if(studentDao.get(student.getLogin()) == null) {
			return studentDao.save(student);
		}
		return null;
	}

	public Student update(Student student) {
		if(studentDao.get(student.getLogin()) != null) {
			return studentDao.save(student);
		}
		return null;
	}

	public Student get(String login) {
		return studentDao.get(login);
	}

	public List<Student> findAllByGroup(Group group) {
		return studentDao.findAllByGroup(group);
	}

	public void delete(Student student) {
		studentDao.delete(student);
	}

}
