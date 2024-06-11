package Logica_Negocio;

import java.util.ArrayList;
import Acceso_Datos.FotografiaDAO;
import Entidades.Fotografia;
public class FotografiaBL {

        private static FotografiaDAO fotDAO = new FotografiaDAO();

        public ArrayList<Fotografia> mostrar (){
            return  fotDAO.mostrar();
        }
        public int guardar(Fotografia pFotografia){
            return fotDAO.guardar(pFotografia);
        }
        public int eliminar(int pId){
            return fotDAO.eliminar(pId);
        }

    }







