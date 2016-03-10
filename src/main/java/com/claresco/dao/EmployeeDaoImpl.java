package com.claresco.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.claresco.model.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addEmployee(Employee employee) {
		//this.sessionFactory.getCurrentSession().save(employee);
		this.entityManager.persist(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		Query query = entityManager.createNamedQuery("selectQuery");
		//Query query = this.entityManager.createQuery("Select e from Employee e");
		List<Employee> employees = query.getResultList();
		//return this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return employees;
	}
	
	@Override
	public void updatePhoebe() {
		Query query = entityManager.createNamedQuery("updatePhoebe");
		query.executeUpdate();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setEntityManger(EntityManager entityManger) {
		this.entityManager = entityManger;
	}
	
}
