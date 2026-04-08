package com.briz.springboot_titans_project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ERepository extends JpaRepository<Employee, Integer> {

}
