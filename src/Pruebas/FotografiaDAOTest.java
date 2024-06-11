package Pruebas;
import Entidades.Fotografia;
import java.util.ArrayList;
import Logica_Negocio.FotografiaBL;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;
class FotografiaDAOTest {
    @org.junit.jupiter.api.Test
    void mostrar() {
    FotografiaBL fotografiaBL= new FotografiaBL();
    ArrayList<Fotografia> fotografias = fotografiaBL.mostrar();
    assertNotNull(fotografias,"La lista de fotografias no debe de ser nula");
    assertFalse(fotografias.isEmpty(),"La lista no debe ser vacia");
}

    @org.junit.jupiter.api.Test
    @Order(1)
    void guardar() {
       FotografiaBL fotografiaBL = new FotografiaBL();
        Fotografia fotografia = new Fotografia("El principito "," Un libro de aventuras "," Seccion 25");
        int result = fotografiaBL.guardar(fotografia);
        assertEquals(1,result,"Debe devolver 1");
    }

    @org.junit.jupiter.api.Test
    void eliminar() {
        FotografiaBL fotografiaBL= new FotografiaBL();
        int result = fotografiaBL.eliminar(11);
        assertEquals(1,result,"Deberia devolver 1");
    }

}













