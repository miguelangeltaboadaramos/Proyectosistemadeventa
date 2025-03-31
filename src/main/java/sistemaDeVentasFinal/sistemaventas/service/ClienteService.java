package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Cliente;
import sistemaDeVentasFinal.sistemaventas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
