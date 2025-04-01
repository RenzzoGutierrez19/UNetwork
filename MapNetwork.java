import java.io.IOException;

public class MapNetwork {
    public static void main(String[] args) {
        String networkLetter = "Z:";
        String pathNetw = "\\\\" + "LAPTOP-152S5RQ0" + "\\" + "Python";

        String command = "net use " + networkLetter + " " + pathNetw;
        try {
            String deleteNet = "net use " + networkLetter + " /delete";
            Process deleteProcess = Runtime.getRuntime().exec(deleteNet);
            deleteProcess.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar la unidad de red");
        }
        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            System.out.println("Unidad de red mapeada correctamente.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al mapear la unidad de red");
        }
    }
}
