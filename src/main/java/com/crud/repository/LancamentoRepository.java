package com.crud.repository;

import java.util.List;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.crud.model.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({
@NamedQuery(name="LancamentoRepository.findByFuncionarioId",query = "SELECT LANC FROM LANCAMENTO LANC WHERE LANC.FUNCIONARIO.ID =: funcionarioId")})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	
	List<Lancamento> findByFuncionarioId (@Param("funcionarioId") Long funcionarioId);
	
	Page<Lancamento> findByFuncionarioId (@Param("funcionarioId") Long funcionarioId, Pageable pageAble);

}
