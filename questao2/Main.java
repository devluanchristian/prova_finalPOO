
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AchadoPerdido achadoPerdido = new AchadoPerdido("O teste", "Testando o teste", "Teste", "aprovado");
        achadoPerdido.completaDados("Foto imagem de teste", "Belo Horizonte", "12-11-2022");
        boolean busca = achadoPerdido.buscarTitulo(achadoPerdido.getTitulo());
        if (busca == true) {
            JOptionPane.showMessageDialog(null, "Titulo não foi encotrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar esse titulo, tente novamente");
        }
        JOptionPane.showMessageDialog(null, achadoPerdido.visualizarDetalhe());
    }
}