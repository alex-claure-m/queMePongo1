import java.util.Set;

public class Usuario {
    //
    private Set<Guardaropa> guardaropa;

    public Usuario(Set<Guardaropa> guardaropa) {
        this.guardaropa = guardaropa;
    }

    public Set<Guardaropa> getGuardaropa() {
        return guardaropa;
    }

}
