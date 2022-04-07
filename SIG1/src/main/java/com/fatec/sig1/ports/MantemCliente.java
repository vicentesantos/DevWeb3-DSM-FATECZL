package com.fatec.sig1.ports;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD
=======

>>>>>>> 43ee7a6acb3b9f8ee8148fea475d37d5ddf59115
import com.fatec.sig1.model.Cliente;

public interface MantemCliente {
	List<Cliente> consultaTodos();

	Optional<Cliente> consultaPorCpf(String cpf);

	Optional<Cliente> consultaPorId(Long id);

	Optional<Cliente> save(Cliente cliente);

	void delete(Long id);

	Optional<Cliente> altera(Cliente cliente);
}