package com.crud.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class LancamentoRepositoryTest {
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Autowired
	LancamentoRepository lancamentoRepository;
	
	private Long funcionarioId;

}
