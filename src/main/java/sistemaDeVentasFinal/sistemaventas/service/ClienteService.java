package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Cliente;
import sistemaDeVentasFinal.sistemaventas.repository.ClienteRepository;

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

    public Cliente obtenerClienteXid(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
