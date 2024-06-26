package med.clinicavoll.api.domain.paciente;

import med.clinicavoll.api.domain.direccion.Direccion;

public record DatosRespuestaPaciente(Long id, String nombre, String email, String documento, String telefono, Direccion direccion) {

    public DatosRespuestaPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumento(), paciente.getTelefono(), paciente.getDireccion());
    }
}
