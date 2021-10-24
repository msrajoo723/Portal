package com.vinnotech.employee.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

	/*
	 * 
  CREATE TABLE `empdb`.`user` (
  `ID` INT NOT NULL,
  `USERNAME` VARCHAR(45) NULL,
  `PASSWORD` VARCHAR(60) NULL,
  `ROLE` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `USERNAME_UNIQUE` (`USERNAME` ASC));
  
  INSERT INTO `empdb`.`user` (`ID`, `USERNAME`, `PASSWORD`, `ROLE`) VALUES ('1', 'user', '$2a$12$IJ2n4K4J33n1uBmny.2zzO8AeOb5g.hX2jBGAd3kAlk7izKkzzcVK', 'EMPLOYEE');

	 */
}
