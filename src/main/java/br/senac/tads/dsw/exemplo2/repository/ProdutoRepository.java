package br.senac.tads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.tads.dsw.exemplo2.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
