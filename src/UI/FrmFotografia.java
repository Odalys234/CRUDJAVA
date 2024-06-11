package UI;
import Entidades.Fotografia;
import javax.swing.*;
import java.util.ArrayList;
import Logica_Negocio.FotografiaBL;
public class FrmFotografia {
    private JPanel panelFotografia;
    private JTextField titulotxt;
    private JTextField descripciontxt;
    private JTextField ubicaciontxt;
    private JButton GUARDARButton;
    private JList Fotografialist;
    public FrmFotografia() {
        cargarFotografia();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista fotografias");
        frame.setContentPane(new FrmFotografia().getPanelFotografia());
        frame.pack();
        frame.setVisible(true);
    }
    public JPanel getPanelFotografia() {
        return panelFotografia;
    }

    public void setPanelFotografia(JPanel panelFotografia) {
        this.panelFotografia = panelFotografia;
    }

    private FotografiaBL fotografiaBL = new FotografiaBL();
    private void cargarFotografia(){
       ArrayList<Fotografia> fotografias = fotografiaBL.mostrar();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Fotografia fotografia: fotografias){
            listModel.addElement(fotografia.getTitulo() + fotografia.getDescripcion() + fotografia.getUbicacion());
        }
        Fotografialist.setModel(listModel);
    }
}







