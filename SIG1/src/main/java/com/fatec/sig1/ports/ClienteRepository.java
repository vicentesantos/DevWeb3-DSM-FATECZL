package com.fatec.sig1.ports;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
=======

>>>>>>> 43ee7a6acb3b9f8ee8148fea475d37d5ddf59115
import com.fatec.sig1.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Optional<Cliente> findByCpf(String cpf);

	List<Cliente> findAllByNomeIgnoreCaseContaining(String nome);
<<<<<<< HEAD
}
=======

	Cliente save(Cliente cliente);
}
>>>>>>> 43ee7a6acb3b9f8ee8148fea475d37d5ddf59115
