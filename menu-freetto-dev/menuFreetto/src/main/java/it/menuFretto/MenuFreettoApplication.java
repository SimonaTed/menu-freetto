package it.menuFretto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import it.menuFretto.entity.MenuEntity;
import it.menuFretto.entity.StrutturaEntity;
import it.menuFretto.service.MenuService;
import it.menuFretto.service.MenuServiceImpl;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@SpringBootApplication
public class MenuFreettoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MenuFreettoApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	
	
	}
	
	
	
}
