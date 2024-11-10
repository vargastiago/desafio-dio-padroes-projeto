package one.digitalinnovation.gof.adapter;

import one.digitalinnovation.gof.dto.ClienteDTO;
import one.digitalinnovation.gof.model.Cliente;

public class ClienteDTOAdapter {

	public static ClienteDTO adaptar(Cliente cliente) {
		return new ClienteDTO(cliente.getNome(), cliente.getEndereco().getCep());
	}

}
